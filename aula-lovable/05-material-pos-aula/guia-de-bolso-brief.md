# Guia de bolso BRIEF — LPs no Lovable sem cara de IA

> **Prompt bom é briefing bom.** A IA é um freela brilhante que nunca ouviu falar do seu cliente. Se você não decide, ela decide pela média.

---

## A fórmula

| | Bloco | Pergunta que responde | Não esqueça |
|---|---|---|---|
| **B** | Base do negócio | Quem é o cliente e com quem ele fala? | O que vende, público real, diferencial, tom de voz (e o que a marca nunca diria), contexto da campanha |
| **R** | Resultado | Qual é a ÚNICA ação da página? | Texto exato do CTA, campos e por quê, LGPD, origem do tráfego (celular?), o que acontece após o envio |
| **I** | Identidade | Como a marca se parece? | Cores em HEX, nomes das fontes, 3 palavras de vibe, estilo de imagem. Anexe o brandbook **e** repita o essencial no texto |
| **E** | Estrutura | O que vem em cada parte? | Seções na ordem, uma função por seção, **textos reais** (nada de lorem ipsum) |
| **F** | Fator uau | Qual é a experiência que ninguém esquece? | **Permissão + direção + coerência:** libere 3D e scroll, descreva cada momento e faça todo efeito nascer da marca |
| **+** | Carimbo | Quais regras sempre valem? | Bloco fixo no fim (abaixo) |

**Dica de ouro:** diga o **porquê** ("formulário curto *porque* o tráfego é do Instagram no celular"). A IA acerta mais quando entende a intenção.

---

## Modelo para copiar

```text
Crie a landing page de [o quê] da [cliente]. [Anexei o brandbook e o logo: siga à risca.]

[B] SOBRE O CLIENTE
[Quem é, o que vende, para quem, diferencial. Tom de voz: ___. Nunca dizer: ___. Contexto da campanha: ___.]

[R] RESULTADO
Ação única: [___], com o CTA "[___]". Formulário: [campos], porque [motivo]. Checkbox LGPD. Tráfego: [origem e dispositivo]. Após o envio: [___].

[I] IDENTIDADE VISUAL
Vibe: [3 palavras + palavras-chave em inglês]. Cores: [HEX e papel de cada uma]. Fontes: [títulos] e [texto]. Imagens: [foto real / gerada (estilo, luz) / ilustração vetorial].

[E] ESTRUTURA (nesta ordem, com os textos em português)
1. Hero: headline "[___]", subtítulo "[___]", CTA.
2. [___]
3. [___]
...

[F] FATOR UAU
Você tem liberdade total para criar uma experiência cinematográfica: 3D, animações ligadas ao scroll e ilustrações vetoriais. Use Three.js, GSAP com ScrollTrigger e Lenis. Cada efeito vem do universo da marca:
1. [hero: o símbolo ou o produto em 3D, reagindo ao mouse e ao scroll]
2. [scroll: texto que acende, números em seção fixa, rolagem horizontal…]
3. [ritmo: letreiro, cards que expandem, imagens presas na tela]
4. [fechamento: neon da marca no CTA, nome gigante no rodapé]
No celular, 3D mais leve. Com "reduzir movimento", versão estática e completa.

[CARIMBO]
Sem cara de template: nada de gradiente roxo, emoji como ícone, grade de cards iguais com ícone ou frases genéricas. Nenhum efeito sem motivo: se não vem da marca ou da história, sai. Mobile-first, rápido e acessível. Se faltar alguma informação importante, me pergunte antes de construir.
```

---

## Palavras que funcionam (escreva em português, mantenha estes termos em inglês)

- **Vibe:** premium (*refined, layered depth*) · ousado (*bold, brutalist, oversized typography*) · editorial (*magazine-style grid*) · calmo (*soft gradients, generous spacing*) · futurista (*dark mode, glowing edges*) · orgânico (*earth tones, hand-drawn, botanical*)
- **Hero 3D:** *3D scene with Three.js* · *tilt on mouse move* · *brand symbol as 3D object* · *floating 3D mockup* · *headline line by line*
- **Scroll:** *scroll-linked text reveal* · *sticky section with big numbers* · *horizontal scroll section* · *parallax* · *marquee with scroll velocity* · *count-up*
- **Acabamento:** *thin oversized typography* · *1px hairlines* · *grain texture* · *duotone photos* · *glowing neon outline* · *giant wordmark footer*
- **Interação:** *hover states* · *smooth transitions* · *interactive quiz/calculator* · *before-after slider* · *success animation*
- **Bibliotecas (o Lovable instala sozinho):** Framer Motion · GSAP ScrollTrigger · Lenis · Three.js · componentes do 21st.dev

Lista completa: `dicionario` (no material do assistente).

---

## Pedidos de ajuste que funcionam

Fórmula: **o que muda + onde + o que NÃO pode mudar.** Um assunto por mensagem. *Escreveu "e" mais de duas vezes? Divida.*

- **Mais ousado:** "Deixe o hero mais ousado: tipografia maior, mais contraste e um elemento memorável. Não mude o conteúdo."
- **Mais calmo:** "Tem efeito demais. Mantenha só a animação do hero e a de [X]. Remova o resto."
- **Enxugar:** "Corte 30% do texto sem perder informação. Uma ideia por seção."
- **Mobile:** "Revise em 390 px: títulos, botões e espaçamentos. Não mude o desktop."
- **Polimento:** "Faça uma passada crítica: tipografia, espaçamento, contraste e tudo que parecer genérico. Não adicione funcionalidades e não mude a paleta."
- **Explorar antes:** "Descreva três direções visuais para o hero antes de construir qualquer coisa."

---

## Fluxo profissional no Lovable

1. **Plan mode** para começar (1 crédito por mensagem, não mexe no código) + "me faça as perguntas que precisar".
2. **Anexe o cliente:** brandbook em PDF, logo, prints de referência, arquivo do Figma (.fig). Para redesenhar o site que o cliente já tem: importe pela URL.
3. **Prompt BRIEF** = o esqueleto. O primeiro resultado é base, não obra final.
4. **Ajuste por seção**, um assunto por mensagem. Várias mudanças pequenas? Uma lista numa mensagem só.
5. **Aponte em vez de descrever:** no preview, *Select elements* (seleciona e pede a mudança) ou *Draw* (desenha por cima).
6. **Feche:** passada de polimento → marque a versão boa no histórico → peça *"Escreva as instruções do projeto com base no que construímos"* e salve em **Instructions**.

Se algo quebrou e o *Try to fix* falhou 2 vezes: Plan mode + "Investigue a causa raiz antes de alterar qualquer código."

---

## Checklist antes de publicar

- [ ] Tirando o logo, a página ainda tem cara da marca? (teste da marca)
- [ ] Uma ação só, com o mesmo texto de CTA em todo lugar
- [ ] Funciona bem no celular (o tráfego de mídia é quase todo mobile)
- [ ] Nada de: gradiente roxo aleatório, emoji como ícone, cards iguais, selos em tudo, frase clichê
- [ ] Textos revisados, sem dado inventado (números, depoimentos, preços)
- [ ] Formulário com consentimento LGPD e link da política de privacidade
- [ ] Título, descrição e imagem de compartilhamento ajustados
- [ ] Pixel/eventos e integrações validados com o time responsável
- [ ] Segmento regulado (saúde, estética, financeiro, imobiliário, jurídico)? Validado com o jurídico/compliance

---

## Atalho

Use o **Assistente BRIEF** (Gem no Gemini / Skill no Claude): cole o briefing do cliente e receba o prompt pronto, os ajustes e as Instructions do projeto.
