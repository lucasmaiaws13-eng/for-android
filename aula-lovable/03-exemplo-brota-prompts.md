# 03 — O exemplo da aula: Brota + e-book "Selva de Apê"

> O case fictício que sustenta a parte prática da aula: **um cliente com brandbook**, **um e-book como isca de leads** e **dois prompts** — o "de sempre" e o BRIEF — com as duas LPs que eles representam, já construídas e capturadas.

---

## 1. O cliente fictício

**Brota** é uma loja de plantas para apartamento (e-commerce com entrega em São Paulo + loja em Pinheiros).
- **Propósito:** fazer qualquer apê virar um cantinho verde, sem culpa e sem planta morta.
- **Público:** 25 a 40 anos, mora em apartamento, trabalha muito e já perdeu algumas plantas.
- **Tom de voz:** amiga que entende de planta. Bem-humorada, acolhedora, frases curtas, zero culpa, zero jargão.

**A campanha:** captar leads com o e-book gratuito **"Selva de Apê — o guia das plantas que não morrem"** (52 páginas, 7 capítulos, escrito pela bióloga e cofundadora Marina Okabe). O tráfego vem de Instagram e Pinterest Ads, quase todo no celular.

### O brandbook (existe *antes* do prompt — e é isso que muda o jogo)
Pasta `exemplos/brota-brandbook/`:

| Arquivo | O que é |
|---|---|
| `brandbook.html` / `brandbook-brota.pdf` | Brandbook de 1 página: essência, logo, cores, tipografia, elementos gráficos, tom de voz |
| `logo-brota.svg` | Logo positivo (fundo claro) |
| `logo-brota-negativo.svg` | Logo negativo (fundo escuro) |
| `logo-brota-mono.svg` | Logo monocromático |
| `simbolo-brota.svg` | Símbolo (o "o" com o broto) |

**Resumo do brandbook:**
- **Cores:** Mata `#0E3B2C` (principal) · Broto `#C9F264` (destaque, só sobre Mata) · Antúrio `#FF6F91` (adesivos de humor, pouco) · Musgo `#3E8E4E` (ilustrações) · Folha Clara `#EEF4E6` (fundo) · Nuvem `#FBFDF7` (respiro)
- **Fontes:** Bricolage Grotesque ExtraBold (títulos) + Figtree (textos). Nunca Inter/Arial.
- **Elementos:** ilustrações vetoriais chapadas de folhas (costela-de-adão, jiboia, espada-de-são-jorge), adesivo rosa inclinado, botões em pílula, cantos de 14 px. Nada de foto de banco, gradiente decorativo ou emoji como ícone.
- **Tom:** fala "Chega de velório de planta."; nunca fala "Transforme seu lar em um oásis verde".

> **A lição escondida no case:** o brandbook já existia nas duas versões. Na genérica, ele **não entrou no prompt** — e a IA inventou uma marca roxa com emoji. *A IA não lê a pasta do cliente. Ela lê o seu prompt.*

---

## 2. Prompt "de sempre" → LP genérica

```text
Crie uma landing page bonita e moderna para um e-book gratuito sobre cuidados com plantas da marca Brota, com formulário para download.
```

**Resultado:** `exemplos/lp-generica/index.html` (prints e vídeo em `exemplos/capturas/generica-*`)

O que aparece (e é o roteiro do slide "aponte os sinais"):
1. Gradiente roxo → azul no botão, no mockup, na seção do formulário e no texto ("oásis verde") — numa marca de **plantas**.
2. Fonte Inter em tudo.
3. Selo `✨ E-BOOK 100% GRATUITO` acima do título, e um selo acima de **cada** seção (📚 CONTEÚDO, 💡 BENEFÍCIOS…).
4. Headline genérica: "Transforme sua casa em um oásis verde 🌱" (exatamente o que o brandbook proíbe).
5. Emojis no lugar de ícones (🌱 💧 ☀️ 🪴 🐛 📅).
6. Seis cards idênticos, com ícone + título + frase.
7. Mockup do e-book = retângulo com gradiente e emoji 🪴; badges flutuando por cima.
8. Faixa de números (10k+, 50+, 4.9, 100%) sem contexto.
9. Depoimentos genéricos com ⭐⭐⭐⭐⭐ ("mudou completamente minha relação com as plantas!").
10. Bolhas desfocadas no fundo; fade-up igual em todos os blocos.
11. Formulário só com nome e e-mail: nenhuma segmentação, nenhum consentimento LGPD.
12. Logo = emoji 🌿 + texto. **O logo real da marca nem aparece.**

> Frase para o slide: *"Funciona. Mas poderia ser de qualquer marca. E não é a Brota."* (teste da marca)

---

## 3. Prompt BRIEF → LP espetacular

> No Lovable: **anexe o `brandbook-brota.pdf` e o `logo-brota.svg`** na mesma mensagem e cole o prompt abaixo.
> Repare: o essencial do brandbook é **repetido no texto** (cores, fontes, tom). Anexo ajuda, mas o texto do prompt é o que a IA mais segue.

```text
Crie a landing page de captura do e-book gratuito "Selva de Apê", da Brota. Anexei o brandbook e o logo: siga à risca.

[B] SOBRE O CLIENTE
A Brota é uma loja de plantas para apartamento em São Paulo (e-commerce + loja em Pinheiros). Propósito: fazer qualquer apê virar um cantinho verde, sem culpa e sem planta morta. Público: 25 a 40 anos, mora em apartamento, trabalha muito e já perdeu algumas plantas pelo caminho. Tom de voz: amiga que entende de planta — bem-humorada, acolhedora, frases curtas, zero culpa e zero jargão.
O e-book: "Selva de Apê — o guia das plantas que não morrem", 52 páginas, da bióloga Marina Okabe, cofundadora da Brota. Capítulos: Que luz é essa?; Rega sem drama; As 12 indestrutíveis; Vaso, terra e drenagem; Pragas sem pânico; Pets e plantas; Calendário verde. Bônus: calendário de rega para imprimir.

[R] RESULTADO
Objetivo: captar leads para a régua de e-mails. Ação única: baixar o e-book, com o CTA "Quero o guia grátis". Formulário: nome, e-mail e "Quantas plantas você tem hoje?" (Nenhuma ainda / 1 a 5 / 6 ou mais / Perdi a conta), porque essa resposta segmenta a régua. Checkbox LGPD. O tráfego vem de Instagram e Pinterest Ads, quase todo no celular: formulário curto e CTA sempre à mão (fixo no rodapé no celular). Por enquanto, o envio só mostra uma mensagem de sucesso.

[I] IDENTIDADE VISUAL
Cores: Mata #0E3B2C (base e textos), Broto #C9F264 (CTAs, só sobre fundo Mata), Folha Clara #EEF4E6 (fundo), Musgo #3E8E4E (ilustrações), Antúrio #FF6F91 (só em adesivos de humor). Fontes: Bricolage Grotesque ExtraBold nos títulos, bem grandes e apertados; Figtree nos textos. Linguagem visual: ilustrações vetoriais chapadas de folhas (costela-de-adão, jiboia, espada-de-são-jorge), nada de foto de banco. Botões em pílula com o ícone de broto, cantos de 14 px.

[E] ESTRUTURA (textos em português, no tom da marca)
1. Hero: headline "Chega de velório de planta.", subtítulo sobre o guia, CTA e o e-book.
2. Faixa escura com as desculpas clássicas ("esqueci de regar", "reguei demais", "o gato comeu"...) e a virada: "Não é falta de mão verde. É falta de manual."
3. O que tem dentro: os 7 capítulos + bônus.
4. Teste rápido "Qual é a luz do seu apê?": 3 opções que mostram 3 plantas indicadas cada (amostra do capítulo 1).
5. Quem escreveu: Marina Okabe, com uma frase dela.
6. Prova social: 18.400 downloads e 2 depoimentos curtos com quantas plantas a pessoa tem.
7. CTA final com o formulário, em fundo Mata.

[F] FATOR UAU
Você tem liberdade para sair do genérico: animação, scroll, 3D e ilustração vetorial. Quero 3 momentos marcantes:
1. Hero: mockup 3D do e-book que inclina com o movimento do mouse e flutua devagar, entre folhas vetoriais que balançam; a headline entra palavra por palavra.
2. "O que tem dentro" é o grande momento: um ramo de planta cresce conforme a pessoa rola a página, abrindo uma folha em cada capítulo.
3. As desculpas rolam em loop, como letreiro.
No resto, só revelações sutis e hovers discretos. Ao enviar o formulário, uma chuva de folhinhas.

[CARIMBO] REGRAS DE QUALIDADE
Sem cara de template: nada de gradiente roxo, emoji como ícone, cards idênticos em grade, selo acima dos títulos ou frases genéricas. Mobile-first, rápido e respeitando a preferência de reduzir movimento.
```

**Resultado:** `exemplos/lp-espetacular/index.html` (prints e vídeos em `exemplos/capturas/espetacular-*`)

**Tamanho do prompt:** ~520 palavras = cerca de 1 página. Não é "prompt gigante de engenheiro": é **um briefing organizado em 5 blocos**, que qualquer pessoa de mídia consegue escrever em 10 minutos a partir do briefing do cliente (ou em 1 minuto com o assistente pós-aula).

---

## 4. Mapa "o que no prompt virou o quê na página"

Base dos slides de anatomia: cada trecho destacado do prompt "acende" a área correspondente na LP.

| Letra | Trecho do prompt | Onde aparece na LP espetacular | Print/clipe |
|---|---|---|---|
| **B** | "bem-humorada… zero culpa" | Headline "Chega de velório de planta.", depoimento "Os velórios caíram bastante." | `espetacular-hero.png` |
| **B** | "52 páginas, Marina Okabe, capítulos…" | Capa, seção de capítulos, seção da autora | `espetacular-ramo-capitulos.png` |
| **R** | "Ação única… 'Quero o guia grátis'" | Mesmo texto do CTA no menu, no hero, nos capítulos, no rodapé mobile e no formulário | `espetacular-hero.png` |
| **R** | "'Quantas plantas você tem hoje?'… segmenta a régua" | Pergunta em pílulas no formulário | `espetacular-formulario-sucesso.png` |
| **R** | "quase todo no celular… CTA fixo" | Botão fixo no rodapé do celular | `espetacular-celular-pagina-inteira.png` |
| **R** | "Checkbox LGPD" | Consentimento no formulário | idem |
| **I** | Paleta com hex + regra "Broto só sobre Mata" | Verde-limão só nos CTAs sobre fundo escuro | todas |
| **I** | "Bricolage Grotesque… bem grandes e apertados" | Títulos gigantes com personalidade | `espetacular-hero.png` |
| **I** | "ilustrações vetoriais de folhas… nada de foto de banco" | Costela-de-adão, jiboia e espada-de-são-jorge no hero e nas plantas | `espetacular-hero.png`, `espetacular-teste-de-luz.png` |
| **E** | Ordem das 7 seções | A página segue exatamente essa ordem | `espetacular-desktop-pagina-inteira.png` |
| **E** | "Teste rápido… 3 plantas por opção" | Seletor Sol direto / Claridade / Pouca luz | `espetacular-clip4-teste-de-luz.mp4` |
| **F** | "mockup 3D que inclina… headline palavra por palavra" | Entrada do hero | `espetacular-clip1-hero.mp4` |
| **F** | "ramo cresce conforme rola… uma folha por capítulo" | O grande momento | `espetacular-clip3-ramo-crescendo.mp4` |
| **F** | "desculpas em loop, como letreiro" | Faixa escura animada | `espetacular-clip2-desculpas.mp4` |
| **F** | "chuva de folhinhas" | Sucesso do formulário | `espetacular-clip5-formulario.mp4` |
| **Carimbo** | "sem gradiente roxo, emoji, cards iguais, selo…" | Ausência de todos os sinais da versão genérica | `comparativo-heroes.png` |

---

## 5. Versão condensada do prompt (para caber no slide)

```text
Crie a landing page do e-book "Selva de Apê", da Brota. Anexei o brandbook.

[B] Loja de plantas p/ apê · público 25–40 que já perdeu plantas ·
    tom: amiga bem-humorada, zero culpa · e-book de 52 págs da bióloga Marina

[R] Ação única: "Quero o guia grátis" · nome, e-mail e "quantas plantas
    você tem?" (segmenta a régua) · LGPD · tráfego mobile → CTA fixo

[I] Mata #0E3B2C + Broto #C9F264 · Bricolage Grotesque + Figtree ·
    folhas vetoriais, nada de foto de banco

[E] Hero → desculpas → capítulos → teste de luz → autora → prova → formulário

[F] Liberdade p/ sair do genérico · 3 momentos: livro 3D que inclina,
    ramo que cresce no scroll, letreiro de desculpas

[Carimbo] Sem cara de template · mobile-first · reduzir movimento
```

---

## 6. (Opcional) A etapa intermediária: só B + R + E

Se quiser mostrar a progressão em 3 passos ("conteúdo primeiro, visual depois"), este é o prompt do meio. **Não foi construído**; no slide basta mostrar o prompt e dizer: *"Com só essas três letras, a página já fala com o público certo e converte melhor, mas o visual continua de template — porque ninguém disse à IA como a marca é."*

Ele é o prompt BRIEF **sem** os blocos [I], [F] e [Carimbo] (e sem a frase "Anexei o brandbook").

---

## 7. Quer validar no Lovable antes da aula? (opcional, ~15 min)

As duas LPs foram construídas como **demonstração fiel** do que cada prompt pede (você disse que podia ser demonstrativo). Se quiser também um resultado 100% Lovable para mostrar ou comparar:
1. Projeto novo → anexe `brandbook-brota.pdf` + `logo-brota.svg` → cole o prompt BRIEF → Build.
2. Não espere que fique idêntico: o importante é ver os blocos do prompt aparecendo no resultado.
3. Se faltar polimento, rode os ajustes abaixo, um por vez.

**Ajustes pós-geração (são também exemplos para a aula):**
```text
Na seção "O que tem dentro", o ramo deve crescer de forma contínua conforme a rolagem e abrir uma folha exatamente na altura de cada capítulo. Não mexa nas outras seções.
```
```text
O hero está com elementos demais. Deixe só o logo, a headline, o subtítulo, o CTA, o livro e as folhas. Remova selos ou caixinhas por cima.
```
```text
Faça uma passada crítica na página inteira: ajuste tipografia e espaçamento, garanta contraste nos textos e corrija tudo que parecer genérico. Não adicione seções e não mude a paleta.
```

---

## 8. Inventário de capturas (`exemplos/capturas/`)

| Arquivo | Conteúdo | Uso sugerido |
|---|---|---|
| `comparativo-heroes.png` | Hero genérico × hero espetacular lado a lado | Abertura (gancho) e fechamento |
| `generica-hero.png` | Primeira dobra da genérica (2x) | "Aponte os sinais" |
| `generica-desktop-pagina-inteira.png` / `generica-celular-pagina-inteira.png` | Página inteira | Demo, etapa 0 |
| `generica-rolagem.mp4` (20 s) | Rolagem da genérica | Demo, etapa 0 |
| `espetacular-hero.png` / `espetacular-celular-hero.png` | Primeira dobra (2x / 3x) | Abertura, anatomia |
| `espetacular-desculpas.png` | Faixa de desculpas | Letra F |
| `espetacular-ramo-capitulos.png` | Ramo com folhas | Letra F |
| `espetacular-teste-de-luz.png` | Teste interativo | Letra E |
| `espetacular-prova-social.png` | Autora | Letra B |
| `espetacular-formulario-sucesso.png` | Formulário enviado + chuva de folhas | Letra R |
| `espetacular-desktop-pagina-inteira.png` / `espetacular-celular-pagina-inteira.png` | Página inteira | Demo |
| `espetacular-rolagem-completa.mp4` (53 s) | Tour completo acelerado | Demo (fundo do slide) |
| `espetacular-clip1-hero.mp4` … `clip5-formulario.mp4` (9–14 s cada) | Cada momento "uau" | Slides de anatomia |

**Para abrir as LPs ao vivo:** abra `exemplos/lp-generica/index.html` e `exemplos/lp-espetacular/index.html` no navegador (precisa de internet só para as fontes do Google). No modo apresentação, use a LP espetacular ao vivo por 30 s: mexa o mouse no livro, role até o ramo e clique no teste de luz. É o momento "uau" da aula.
