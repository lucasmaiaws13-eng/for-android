# 03 — O exemplo da aula: Vingô e o e-book "Selva de Apê"

O case didático da aula: uma marca fictícia **com brandbook**, um **e-book como isca de leads** e **dois prompts** (o de sempre e o completo), com as duas LPs que eles representam, já construídas e capturadas.

---

## 1. Vingô: o cliente fictício

**Vingô** é uma loja de plantas para apartamento (e-commerce em São Paulo + loja em Pinheiros). O nome vem de planta que "vingou"; o broto do logo é o acento do "ô".
- **Propósito:** fazer qualquer apê virar um cantinho verde, sem culpa e sem planta morta.
- **Público:** 25 a 40 anos, mora em apartamento, trabalha muito e já perdeu algumas plantas.
- **Tom de voz:** amiga que entende de planta. Bem-humorada, acolhedora, frases curtas, zero culpa, zero jargão.

**A campanha:** captar leads com o e-book gratuito **"Selva de Apê, o guia das plantas que não morrem"** (52 páginas, 7 capítulos + bônus, da bióloga Marina Okabe). Tráfego de Instagram e Pinterest Ads, quase todo no celular.

### O brandbook (existe antes do prompt, e é isso que muda o jogo)
Pasta `exemplos/vingo-brandbook/`: `brandbook.html`, `brandbook-vingo.pdf`, `logo-vingo.svg`, `logo-vingo-negativo.svg`, `logo-vingo-mono.svg`, `simbolo-vingo.svg`.

- **Cores:** Mata `#0E3B2C` · Broto `#C9F264` · Antúrio `#FF6F91` · Musgo `#3E8E4E` · Folha Clara `#EEF4E6` · Nuvem `#FBFDF7` · Noite `#06140E` (fundo das peças digitais escuras)
- **Fontes:** Bricolage Grotesque (variável: 800 para impacto, 200 a 300 para títulos e números gigantes) + Figtree (textos)
- **Elementos:** ilustrações de folhas (costela-de-adão, jiboia, espada-de-são-jorge), adesivo rosa de humor
- **Tom:** fala "Chega de velório de planta."; nunca fala "Transforme seu lar em um oásis verde"

> **A lição escondida:** o brandbook existia nas duas versões. Na genérica ele **não entrou no prompt**, e a IA inventou uma marca roxa com emoji no lugar do logo. *A IA não lê a pasta do cliente. Ela lê o seu prompt.*

---

## 2. Prompt "de sempre" → LP genérica

```text
Crie uma landing page bonita e moderna para um e-book gratuito sobre cuidados com plantas da marca Vingô, com formulário para download.
```

**Resultado:** `exemplos/lp-generica/index.html` · capturas `generica-*`

Os sinais de "cara de IA" (roteiro do slide "aponte os sinais"):
1. Gradiente roxo → azul numa marca de **plantas** (botão, mockup, formulário e texto em gradiente).
2. Fonte Inter em tudo.
3. Selo `✨ E-BOOK 100% GRATUITO` e um selo com emoji acima de cada seção.
4. Headline clichê: "Transforme sua casa em um oásis verde 🌱".
5. Emojis no lugar de ícones e de logo.
6. Seis cards idênticos com ícone, título e frase.
7. Mockup do e-book = retângulo com gradiente e emoji.
8. Badges flutuando por cima do mockup; bolhas desfocadas no fundo.
9. Faixa de números sem contexto (10k+, 50+, 4.9, 100%).
10. Depoimentos genéricos com ⭐⭐⭐⭐⭐.
11. Formulário só com nome e e-mail: sem segmentação, sem LGPD.
12. O mesmo fade-up em tudo.

---

## 3. Prompt completo (BRIEF) → LP espetacular

> No Lovable: **anexe o `brandbook-vingo.pdf` e o `logo-vingo.svg`** e cole o prompt abaixo. O essencial do brandbook é **repetido no texto**: anexo ajuda, texto manda.

```text
Crie a landing page de captura do e-book gratuito "Selva de Apê", da Vingô. Anexei o brandbook e o logo: siga à risca.

[B] SOBRE O CLIENTE
A Vingô é uma loja de plantas para apartamento em São Paulo (e-commerce + loja em Pinheiros). Propósito: fazer qualquer apê virar um cantinho verde, sem culpa e sem planta morta. Público: 25 a 40 anos, mora em apartamento, trabalha muito e já perdeu algumas plantas pelo caminho. Tom de voz: amiga que entende de planta, bem-humorada, frases curtas, zero culpa e zero jargão.
O e-book: "Selva de Apê, o guia das plantas que não morrem", 52 páginas, da bióloga Marina Okabe, cofundadora da Vingô. Capítulos: Que luz é essa?; Rega sem drama; As 12 indestrutíveis; Vaso, terra e drenagem; Pragas sem pânico; Pets e plantas; Calendário verde. Bônus: calendário de rega para imprimir.

[R] RESULTADO
Objetivo: captar leads para a régua de e-mails. Ação única: baixar o e-book, com o CTA "Quero o guia grátis". Formulário: nome, e-mail e "Quantas plantas você tem hoje?" (Nenhuma ainda / 1 a 5 / 6 ou mais / Perdi a conta), porque essa resposta segmenta a régua. Checkbox LGPD. O tráfego vem de Instagram e Pinterest Ads, quase todo no celular: CTA sempre à mão, fixo no rodapé no celular. Por enquanto, o envio só mostra uma mensagem de sucesso.

[I] IDENTIDADE VISUAL
Direção: cinematográfica, escura e botânica, como o lançamento de um produto premium. Fundo Noite #06140E com camadas de Mata #0E3B2C; Broto #C9F264 é a luz da página (CTAs, palavra-chave de cada título, brilhos); Folha Clara #EEF4E6 nos textos; Antúrio #FF6F91 só no selo de humor. Tipografia: Bricolage Grotesque em pesos finos (200 a 300) e tamanhos enormes para títulos e números, com a palavra-chave em 700 verde-limão; Figtree nos textos. Divisores em linha de 1 px, granulado sutil, ilustrações em traço fino feitas a partir das folhas da marca. Nada de foto de banco.

[E] ESTRUTURA (textos em português, no tom da marca)
1. Hero em tela cheia: "E-book gratuito · Vingô", headline "Chega de velório de planta.", subtítulo, CTA e botão "Ver o que tem dentro"; faixa inferior com 5 fatos (formato, páginas, capítulos, bônus, autora).
2. Manifesto: "Sua planta não morreu por falta de amor. Morreu por falta de manual. O Selva de Apê é o manual que ninguém te deu…" + três apoios curtos.
3. Por que funciona: 4 números (3 semanas, 12, 10 min, 52) com legenda.
4. Letreiro com as desculpas clássicas ("esqueci de regar", "reguei demais", "o gato comeu"…).
5. Capítulos: os 7 + bônus, cada um com uma ilustração em traço.
6. Teste "Qual é a luz do seu apê?": 3 opções, cada uma mostra 3 plantas (amostra do capítulo 1).
7. Autora: Marina Okabe, com uma frase dela.
8. Prova social: 18.400 downloads e 2 depoimentos curtos com quantas plantas a pessoa tem.
9. CTA final com o formulário.
10. Rodapé com o nome da marca gigante, em contorno.

[F] FATOR UAU
Você tem liberdade total para criar uma experiência cinematográfica com 3D, animações ligadas ao scroll e ilustrações vetoriais. Use Three.js, GSAP com ScrollTrigger e Lenis para a rolagem suave. Cada efeito vem do universo da marca:
1. Hero com cena 3D em WebGL: o e-book como objeto 3D com a capa real, flutuando entre folhas 3D extrudadas das ilustrações da marca. Tudo reage ao mouse; ao rolar, o livro gira e as folhas se afastam. A headline entra linha por linha.
2. Manifesto que acende palavra por palavra conforme a rolagem.
3. Seção fixa em que os 4 números trocam com o scroll, com o contorno de uma costela-de-adão em linha fina girando ao fundo.
4. Letreiro em duas linhas, em direções opostas, que acelera com a velocidade da rolagem.
5. Capítulos em rolagem horizontal presa na tela, com barra de progresso; cada ilustração se desenha quando o card entra.
6. CTA final com uma folha em neon verde-limão desenhando-se em volta do formulário; ao enviar, chuva de folhinhas.
No celular, deixe o 3D mais leve. Com "reduzir movimento" ativo, mostre uma versão estática e completa.

[CARIMBO] REGRAS DE QUALIDADE
Sem cara de template: nada de gradiente roxo, emoji como ícone, grade de cards iguais com ícone ou frases genéricas. Nenhum efeito sem motivo: se não vem da marca ou da história, sai. Mobile-first, carregamento rápido (o 3D não pode travar a página) e acessível.
```

**Resultado:** `exemplos/lp-espetacular/index.html` · capturas `espetacular-*`

**Tamanho:** cerca de 700 palavras, uma página e meia. Não é texto difícil: é um briefing organizado em blocos, que qualquer pessoa de mídia escreve em 15 minutos a partir do briefing do cliente (ou em 1 minuto com o Assistente BRIEF).

---

## 4. Mapa "o que no prompt virou o quê na página"

Base dos slides de anatomia: cada trecho destacado do prompt acende a área correspondente da LP.

| Letra | Trecho do prompt | Onde aparece | Captura |
|---|---|---|---|
| **B** | "amiga… zero culpa" | Headline "Chega de velório de planta."; manifesto "não morreu por falta de amor" | `espetacular-hero.png`, `espetacular-manifesto.png` |
| **B** | "52 páginas, Marina Okabe, capítulos" | Faixa de fatos, capítulos, autora | `espetacular-capitulos.png`, `espetacular-autora.png` |
| **R** | "CTA 'Quero o guia grátis'" | Mesmo texto no hero, no rodapé fixo do celular e no formulário | `espetacular-hero.png`, `espetacular-celular-hero.png` |
| **R** | "Quantas plantas você tem hoje?… segmenta a régua" + LGPD | Pílulas e consentimento no formulário | `espetacular-cta-final.png` |
| **I** | "Noite #06140E… Broto é a luz da página" | Fundo escuro; verde-limão só em CTA, palavra-chave e brilho | todas |
| **I** | "Bricolage em pesos finos, tamanhos enormes" | Títulos e números gigantes em traço fino | `espetacular-numeros.png` |
| **I** | "linhas de 1 px, granulado, ilustrações em traço" | Divisores, textura, capítulos | `espetacular-capitulos.png` |
| **E** | 10 seções na ordem | A página segue exatamente essa ordem | `espetacular-desktop-pagina-inteira.png` |
| **F1** | "e-book 3D entre folhas 3D, reage ao mouse" | Hero em WebGL | `espetacular-clip1-hero-3d.mp4` |
| **F2** | "acende palavra por palavra" | Manifesto | `espetacular-clip2-manifesto.mp4` |
| **F3** | "seção fixa, números trocam, contorno girando" | Por que funciona | `espetacular-clip3-numeros.mp4` |
| **F4** | "letreiro que acelera com a rolagem" | Desculpas | `espetacular-letreiro.png` |
| **F5** | "capítulos em rolagem horizontal… ilustração se desenha" | Capítulos | `espetacular-clip4-capitulos.mp4` |
| **F6** | "neon em volta do formulário… chuva de folhinhas" | CTA final | `espetacular-clip6-formulario.mp4` |
| **Carimbo** | "sem gradiente roxo, emoji, cards iguais…" | Nenhum sinal da versão genérica | `comparativo-heroes.png` |

---

## 5. Versão condensada do prompt (para o slide)

```text
Crie a landing page do e-book "Selva de Apê", da Vingô. Anexei o brandbook.

[B] Loja de plantas para apê · público 25–40 que já perdeu plantas ·
    tom de amiga, zero culpa · e-book de 52 págs da bióloga Marina

[R] Ação única: "Quero o guia grátis" · nome, e-mail e "quantas plantas
    você tem?" (segmenta a régua) · LGPD · tráfego mobile, CTA fixo

[I] Cinematográfica e botânica · Noite #06140E + Broto #C9F264 como luz ·
    Bricolage fina e gigante · linhas de 1 px, traço fino, granulado

[E] Hero → manifesto → números → letreiro → capítulos → teste de luz
    → autora → prova → formulário → rodapé com a marca gigante

[F] Liberdade total, tudo vindo da marca: livro 3D entre folhas 3D,
    texto que acende, números fixos, capítulos na horizontal, neon

[Carimbo] Sem cara de template · nenhum efeito sem motivo · leve e acessível
```

---

## 6. Quer validar no Lovable antes da aula? (opcional, ~20 min)

As LPs da Vingô foram construídas como **demonstração fiel** do que cada prompt pede. Para ter também um resultado 100% Lovable:
1. Projeto novo → anexe `brandbook-vingo.pdf` + `logo-vingo.svg` → cole o prompt BRIEF → Build (ou Plan mode primeiro).
2. O resultado não vai sair idêntico. O que importa é ver cada bloco do prompt aparecendo na página.
3. Refine por seção com os ajustes abaixo, um por vez.

```text
No hero, a cena 3D está pesada no celular. Mantenha o livro e no máximo 4 folhas no mobile, com menos brilho. Não mexa no desktop.
```
```text
Na seção dos números, a troca deve acontecer só quando a rolagem passar de cada quarto da seção, com uma transição de baixo para cima. Não mexa nas outras seções.
```
```text
Faça uma passada crítica na página inteira: tipografia, espaçamento e contraste. Remova qualquer efeito que não venha da marca ou da história. Não adicione seções e não mude a paleta.
```

---

## 7. Inventário de capturas (`exemplos/capturas/`)

| Arquivo | Conteúdo |
|---|---|
| `comparativo-heroes.png` | Vingô: hero genérico × hero BRIEF |
| `generica-hero.png`, `generica-*-pagina-inteira.png`, `generica-rolagem.mp4` | Vingô genérica |
| `espetacular-hero.png`, `-manifesto`, `-numeros`, `-numeros-2`, `-letreiro`, `-capitulos`, `-teste-de-luz`, `-autora`, `-prova`, `-cta-final`, `-rodape` | Seções da LP BRIEF |
| `espetacular-celular-hero.png`, `espetacular-*-pagina-inteira.png` | Celular e página inteira (versão estática) |
| `espetacular-clip1-hero-3d.mp4` … `clip6-formulario.mp4` | Cada momento uau (6 a 13 s) |
| `espetacular-tour-completo.mp4` (65 s) | Tour completo da LP BRIEF |
