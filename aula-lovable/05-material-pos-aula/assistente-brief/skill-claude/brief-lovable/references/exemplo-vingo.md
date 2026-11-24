# Exemplo completo: do briefing bagunçado ao prompt BRIEF

Use este exemplo como referência de **nível de qualidade e formato** da resposta. Não copie o conteúdo para outros clientes.

## Entrada (como o usuário costuma mandar)

> preciso de uma lp pro ebook da vingô, aquela loja de plantas de sp. o ebook chama selva de apê, é tipo um guia pra quem mata planta kkk. 52 paginas, quem escreveu foi a marina okabe que é bióloga e sócia. a campanha vai rodar insta e pinterest. querem lead pra régua de email e querem saber quantas plantas a pessoa tem pra segmentar. tenho o brandbook em pdf. cores: verde escuro 0E3B2C, verde limão C9F264, rosa FF6F91, fundo verde claro EEF4E6. fonte bricolage grotesque e figtree. eles são bem humorados. capitulos: luz, rega, 12 plantas indestrutíveis, vaso e terra, pragas, pets, calendário. bonus calendário de rega

## Raciocínio esperado (interno, não precisa mostrar)
- B: completo o suficiente. Público não foi dito → assumir pelo contexto (25–40, apê, já perdeu plantas) e declarar como suposição.
- R: lead para régua + segmentação por nº de plantas → formulário com nome, e-mail e a pergunta; LGPD; tráfego mobile → CTA fixo.
- I: tem brandbook → usar os HEX e fontes exatamente; Musgo não foi citado, não inventar cor nova (usar tons do próprio verde); sugerir anexar PDF + logo.
- E: estrutura de isca digital (ver segmentos.md) adaptada ao humor da marca.
- F: assunto = plantas que crescem → momento uau ligado ao tema: ramo que cresce no scroll. Entrada: capa 3D. Micro: letreiro de desculpas.
- Nada a perguntar de crítico → entregar direto, com suposições listadas.

## Saída ideal

**1. Prompt principal** (cole no Lovable; anexe o brandbook em PDF e o logo)

```text
Crie a landing page de captura do e-book gratuito "Selva de Apê", da Vingô. Anexei o brandbook e o logo: siga à risca.

[B] SOBRE O CLIENTE
A Vingô é uma loja de plantas de São Paulo. Público: 25 a 40 anos, mora em apartamento, trabalha muito e já perdeu algumas plantas pelo caminho. Tom de voz: bem-humorado e acolhedor, como uma amiga que entende de planta — frases curtas, zero culpa e zero jargão.
O e-book: "Selva de Apê — o guia das plantas que não morrem", 52 páginas, da bióloga Marina Okabe, sócia da Vingô. Capítulos: Que luz é essa?; Rega sem drama; As 12 indestrutíveis; Vaso, terra e drenagem; Pragas sem pânico; Pets e plantas; Calendário verde. Bônus: calendário de rega para imprimir.

[R] RESULTADO
Objetivo: captar leads para a régua de e-mails. Ação única: baixar o e-book, CTA "Quero o guia grátis". Formulário: nome, e-mail e "Quantas plantas você tem hoje?" (Nenhuma ainda / 1 a 5 / 6 ou mais / Perdi a conta), porque essa resposta segmenta a régua. Checkbox LGPD com link para a política de privacidade. O tráfego vem de Instagram e Pinterest Ads, quase todo no celular: formulário curto e CTA fixo no rodapé no mobile. Por enquanto, o envio só mostra uma mensagem de sucesso.

[I] IDENTIDADE VISUAL
Cores: verde-escuro #0E3B2C (base e textos), verde-limão #C9F264 (CTAs, só sobre o verde-escuro), fundo #EEF4E6, rosa #FF6F91 só em detalhes de humor (adesivos). Fontes: Bricolage Grotesque ExtraBold nos títulos, grandes e apertados; Figtree nos textos. Linguagem visual: ilustrações vetoriais chapadas de folhas (costela-de-adão, jiboia, espada-de-são-jorge), sem fotos de banco. Botões em pílula.

[E] ESTRUTURA (textos em português, no tom da marca)
1. Hero: headline "Chega de velório de planta.", subtítulo sobre o guia, CTA e o e-book.
2. Faixa escura com as desculpas clássicas ("esqueci de regar", "reguei demais", "o gato comeu"...) e a virada: "Não é falta de mão verde. É falta de manual."
3. O que tem dentro: os 7 capítulos + bônus, cada um com uma frase.
4. Teste rápido "Qual é a luz do seu apê?": 3 opções que mostram 3 plantas indicadas cada.
5. Quem escreveu: Marina Okabe, com uma frase dela.
6. Prova social: [número de downloads] e 2 depoimentos curtos. 
7. CTA final com o formulário, em fundo verde-escuro.

[F] FATOR UAU
Você tem liberdade para sair do genérico: animação, scroll, 3D e ilustração vetorial. Quero 3 momentos marcantes:
1. Hero: mockup 3D do e-book que inclina com o movimento do mouse e flutua devagar, entre folhas vetoriais que balançam; headline entrando palavra por palavra.
2. "O que tem dentro" é o grande momento: um ramo de planta cresce conforme a pessoa rola a página, abrindo uma folha em cada capítulo.
3. As desculpas rolam em loop, como letreiro.
No resto, só revelações sutis e hovers discretos. Ao enviar o formulário, uma chuva de folhinhas. Use Framer Motion.

[CARIMBO] REGRAS DE QUALIDADE
Sem cara de template: nada de gradiente roxo, emoji como ícone, cards idênticos em grade, selo acima dos títulos ou frases genéricas. Mobile-first, rápido e respeitando a preferência de reduzir movimento. Se faltar alguma informação importante, me pergunte antes de construir.
```

**2. O que anexar no Lovable**
- Brandbook em PDF
- Logo em SVG ou PNG transparente (versão para fundo claro e para fundo escuro)
- Capa do e-book (se já existir) — senão, o Lovable cria um mockup no estilo da marca

**3. Próximos prompts (um por vez, depois do primeiro resultado)**
1. "Na seção 'O que tem dentro', o ramo deve crescer de forma contínua com a rolagem e abrir uma folha na altura de cada capítulo. Não mexa nas outras seções."
2. "Revise a página em 390 px de largura: tamanho dos títulos, botões confortáveis para o dedo e o CTA fixo no rodapé. Não mude o desktop."
3. "Faça uma passada crítica: tipografia, espaçamento, contraste e qualquer coisa genérica. Não adicione seções e não mude a paleta."
4. "Ajuste título, descrição e imagem de compartilhamento da página para o e-book Selva de Apê."

**4. Instructions do projeto (cole em Project settings → Instructions)**
```text
Cliente: Vingô, loja de plantas para apartamento (SP). Tom: bem-humorado, acolhedor, frases curtas, zero culpa, zero jargão. Nunca usar clichês como "transforme seu lar em um oásis verde".
Cores: #0E3B2C (base/texto), #C9F264 (CTAs, só sobre fundo escuro), #EEF4E6 (fundo), #FF6F91 (só adesivos de humor). Fontes: Bricolage Grotesque (títulos) e Figtree (textos). Ilustrações vetoriais de folhas; sem fotos de banco, sem emojis como ícone, sem gradientes decorativos.
Toda LP: mobile-first, CTA com texto de ação, formulário com consentimento LGPD, carregamento rápido, respeitar "reduzir movimento".
```

**5. Suposições que fiz (confira)**
- Público de 25 a 40 anos que mora em apartamento (não estava no briefing).
- Número de downloads e depoimentos ficaram como [inserir]: use dados reais do cliente ou remova a seção.
- Mensagem de sucesso sem envio real: conectar ao CRM/ferramenta de e-mail depois.
