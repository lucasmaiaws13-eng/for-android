# Briefing: página /paginas-com-ia

Crie no meu site a página **https://lucasmaiadesign.com/paginas-com-ia**. É o material de um treinamento que dei, "Criação de LPs com IA". A página reúne num lugar só a apresentação do treinamento e o agente de prompt que criei, com instruções de uso e downloads. Quem vai acessar são colegas de agência, a maioria não é designer nem programa. A página tem que ser **simples, clara e rápida de usar**.

Use o design system que o site já tem: mesmas fontes, cores, cabeçalho, rodapé, espaçamentos e componentes. Não crie um estilo novo para esta página.

---

## Arquivos que estou enviando

Coloque como arquivos estáticos, servidos exatamente nestes caminhos. Use a pasta de arquivos públicos do projeto (por exemplo `public/`) e mantenha a estrutura de pastas.

| Arquivo no pacote | URL final |
|---|---|
| `arquivos/materiais/paginas-com-ia/apresentacao/` (pasta inteira: `index.html`, `assets/`, `lp/`) | `/materiais/paginas-com-ia/apresentacao/index.html` |
| `arquivos/materiais/paginas-com-ia/downloads/agente-de-prompt-para-lps.zip` | `/materiais/paginas-com-ia/downloads/agente-de-prompt-para-lps.zip` |
| `arquivos/materiais/paginas-com-ia/downloads/prompt-do-agente.txt` | `/materiais/paginas-com-ia/downloads/prompt-do-agente.txt` |

Importante:
- **Não altere nada dentro de `apresentacao/`.** É um HTML pronto e autossuficiente, com caminhos relativos (`assets/…`, `lp/…`). Não converta em componente, não passe por build, não otimize as imagens, não renomeie arquivos. Ele só precisa ser servido como está.
- Os arquivos estão numa pasta separada (`/materiais/…`) de propósito, para não conflitar com a rota da página `/paginas-com-ia`.

---

## Estrutura da página (nesta ordem)

### 1. Topo
- Etiqueta pequena: **Treinamento**
- Título: **Criação de LPs com IA**
- Subtítulo: **Prompts para criar páginas incríveis no Lovable. Aqui estão a apresentação completa e o agente que monta o prompt com você.**
- Dois botões: **Ver a apresentação** (rola até a seção 2) e **Baixar o agente** (baixa o `.zip`).

### 2. A apresentação
- Título da seção: **A apresentação**
- Texto curto: **Navegue com as setas do teclado ou clicando nas laterais. Clique nos prints das páginas para abrir a landing page de verdade.**
- Incorpore a apresentação num `iframe` apontando para `/materiais/paginas-com-ia/apresentacao/index.html`:
  - proporção **16:9**, largura total do conteúdo, sem borda, com um fundo escuro enquanto carrega;
  - atributos `allow="fullscreen"` e `allowfullscreen` (a apresentação tem botão de tela cheia próprio);
  - `loading="lazy"` e `title="Apresentação: Criação de LPs com IA"`.
- Logo abaixo do iframe, um link: **Abrir em tela cheia ↗**, que abre a mesma URL numa nova aba.
- No celular, o iframe continua 16:9 e o link de tela cheia fica bem visível (a apresentação é melhor de ver em tela grande; escreva isso em texto pequeno abaixo do link no celular).

### 3. O agente de prompt
- Título: **O agente de prompt para LPs**
- Texto: **Ele faz algumas perguntas sobre o cliente (ou você cola o briefing do jeito que estiver) e devolve o prompt pronto para o Lovable, com o que anexar, como rodar e os próximos ajustes. Funciona no Gemini, no ChatGPT, no Claude ou em qualquer IA.**
- Uma linha com o que ele entrega, como etiquetas ou lista curta: **Prompt em blocos · O que anexar · Como rodar · Próximos ajustes · Suposições**

**Botões de acesso.** Crie no código uma configuração simples com os links, assim:

```js
const AGENTE = {
  gem: "",   // link do Gem no Gemini (eu preencho depois)
  gpt: "",   // link do GPT no ChatGPT (eu preencho depois)
};
```

- Se `gem` estiver preenchido, mostre o botão principal **Abrir no Gemini**.
- Se `gpt` estiver preenchido, mostre o botão **Abrir no ChatGPT**.
- Se estiverem vazios, **não mostre** esses botões (nada de botão quebrado ou "em breve").
- Sempre mostre:
  - **Baixar o agente (.zip)** → `/materiais/paginas-com-ia/downloads/agente-de-prompt-para-lps.zip`
  - **Copiar o prompt**: busca o conteúdo de `/materiais/paginas-com-ia/downloads/prompt-do-agente.txt`, copia para a área de transferência e muda o texto do botão para "Copiado!" por 2 segundos. Se a cópia falhar, abre o `.txt` numa nova aba.

### 4. Como usar
Três passos numerados, lado a lado no desktop e empilhados no celular:
1. **Abra o agente.** No Gemini ou no ChatGPT pelos botões acima, ou cole o prompt numa conversa nova de qualquer IA.
2. **Conte sobre o cliente.** Cole o briefing, o site e os textos que tiver, ou responda às perguntas dele.
3. **Leve o prompt para o Lovable.** Cole no Plan mode, responda às perguntas e peça 3 versões do hero antes de construir a página inteira.

Abaixo dos passos, um bloco recolhível (accordion) **Prefere configurar o seu próprio?** com este texto:
- **Gemini:** Gems › Novo Gem. Cole o prompt em "Instruções" e envie os 3 arquivos da pasta `conhecimento` do zip.
- **ChatGPT:** Explorar GPTs › Criar › Configurar. Cole o prompt em "Instructions" e envie os 3 arquivos em "Knowledge".
- **Claude:** Projetos › Novo projeto. Cole o prompt nas instruções do projeto e envie os 3 arquivos.
- Os 3 arquivos de conhecimento são opcionais: o agente funciona sem eles, mas fica mais afiado com eles.

### 5. Os 5 passos de um bom prompt
Título: **O que o agente faz por você**. Uma lista curta, com o título de cada item em negrito:
1. **Briefing inteiro, com os porquês.** Com o motivo, a IA acerta o que você não escreveu.
2. **A marca em dados.** Cores em HEX, fontes pelo nome, brandbook anexado e repetido no texto.
3. **Os textos escritos.** Sem eles, a IA inventa "transforme sua casa em um oásis verde".
4. **Permissão para o incrível.** 3D, animação de scroll e ilustração, com cada momento descrito e tirado da marca.
5. **O que não fazer, no fim.** O essencial vai no começo e as regras no fim: a IA dá mais peso a essas duas partes.

### 6. Rodapé da página
O rodapé padrão do site. Se couber, uma linha antes dele: **Material do treinamento "Criação de LPs com IA", apresentado na Agência Mestre.**

---

## Requisitos

- **SEO:** title "Criação de LPs com IA · Lucas Maia" e meta description "Apresentação e agente de prompt do treinamento Criação de LPs com IA: como criar landing pages incríveis no Lovable." Adicione imagem de compartilhamento se o site já tiver um padrão para isso.
- **Indexação:** a página pode ser indexada normalmente. Os arquivos em `/materiais/` não precisam aparecer no sitemap.
- **Menu:** não adicione a página ao menu principal. Ela é acessada pelo link direto.
- **Responsivo:** teste em 390 px de largura. Botões com área de toque confortável.
- **Acessibilidade:** contraste legível, foco visível nos botões, textos alternativos, o iframe com `title`.
- **Desempenho:** o iframe da apresentação com `loading="lazy"`. A página em si não deve carregar nada pesado.
- **Sem textos de enchimento.** Use exatamente os textos deste briefing. Se precisar de algum texto que não está aqui, me pergunte.

## Antes de terminar, confira

1. `/paginas-com-ia` abre e a apresentação aparece no iframe, com navegação funcionando (setas e clique).
2. Dentro da apresentação, clicar no print de uma LP abre a página em tela cheia (os arquivos de `lp/` estão sendo servidos).
3. Os vídeos da apresentação tocam (os `.mp4` de `assets/` estão sendo servidos com o tipo correto).
4. "Abrir em tela cheia ↗" abre a apresentação numa nova aba.
5. "Baixar o agente (.zip)" baixa o arquivo e "Copiar o prompt" copia o texto inteiro.
6. Sem os links do Gem e do GPT, os botões deles não aparecem.
7. Tudo funciona em 390 px.

Se algo deste briefing não fizer sentido com a estrutura do site, me pergunte antes de construir.
