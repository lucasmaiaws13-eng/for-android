# Dicionário BRIEF — palavras que fazem a IA entregar melhor

Use em português no prompt, mas mantenha os termos técnicos em inglês (entre parênteses ou direto). São os "nomes dos ingredientes" que a IA reconhece.

## 1. Vibes (direções de estilo)

Baseado nas 20 direções de estilo da documentação oficial do Lovable.

| Vibe (PT) | Palavras-chave (EN) | Combina com |
|---|---|---|
| Minimalista e focado | whitespace-driven, frictionless, neutral tones, invisible UI, quiet motion | SaaS, apps de produtividade, consultorias |
| Escandinavo | muted Nordic palette, light wood textures, natural materials, soft neutrals, restrained elegance | Decoração, móveis, lifestyle |
| Calmo e elegante | soft gradients, muted palette, generous spacing, gentle transitions, airy layout | Bem-estar, terapia, spa, saúde mental |
| Premium e sofisticado | refined, translucent surfaces, layered depth, soft blur, elevated accents | Alto padrão, serviços premium, imobiliário de luxo |
| Vidro em camadas | frosted glass, backdrop blur, layered transparency, floating elements, translucent navigation | Apps, tecnologia, portfólios |
| Luxuoso | gold accents, marble textures, serif typography, dramatic shadows, premium spacing | Joalheria, moda de luxo, hotelaria |
| Ousado e disruptivo | grid-heavy, brutalist, raw typography, high contrast, oversized CTAs | Startups, marcas jovens, agências, lançamentos |
| Expressivo e divertido | lively, oversized elements, cheerful curves, saturated tones, energetic layout | Varejo jovem, bebidas, apps de consumo |
| Gamificado | achievement badges, progress rings, streak counters, reward animations, celebration moments | Educação, fitness, programas de fidelidade |
| Futurista e cinematográfico | dark mode, cosmic gradient, glowing edges, motion blur, clean grid | Tecnologia, games, eventos de tech |
| Neon e cyberpunk | neon glow, dark futuristic, electric colors, holographic touches, intense saturation | Games, vida noturna, entretenimento |
| Acolhedor | soft shadows, rounded corners, warm tones, cozy spacing, friendly interactions | Comunidades, serviços locais, pets, família |
| Orgânico e natural | earth tones, flowing shapes, hand-drawn elements, warm textures, botanical | Produtos naturais, sustentabilidade, alimentação saudável |
| Corporativo e confiável | clean lines, structured layout, muted blues, conservative spacing, clear hierarchy | B2B, jurídico, financeiro, seguros |
| Editorial | magazine-style grid, typographic hierarchy, pull quotes, drop caps, featured imagery | Conteúdo, mídia, e-books, educação premium |
| Técnico | monospace accents, dark theme, terminal-style UI, minimal chrome | Ferramentas para desenvolvedores, tech B2B |
| Orientado a dados | sharp angles, chart-inspired, cool grays, precise alignment | Relatórios, dashboards, fintechs |
| Criativo e não convencional | asymmetrical layout, overlapping layers, motion-driven, expressive typography | Agências criativas, portfólios, moda |
| Experimental | broken grid, color clashing, experimental fonts, avant-garde | Arte, galerias, festivais |
| Retrô | vintage gradients, pixel elements, retro typography, 80s/90s aesthetic | Games, nostalgia, cervejarias, entretenimento |

Dicas:
- Seja específico: "bold, saturated colors" > "colorido"; "calm and elegant, generous spacing" > "clean".
- Dá para mudar o tom por seção: hero "bold", preços "calm and reassuring".
- Sempre que possível, dê **cores em HEX** e **nomes de fontes** (Google Fonts). Isso tira a IA do padrão.

## 2. Fontes: fuja do padrão

- Padrões que entregam "cara de IA" quando ninguém escolheu: Inter, Roboto, Arial, Open Sans, fontes de sistema. (Poppins e Montserrat também estão muito batidas.)
- Pares que funcionam bem (Google Fonts):
  - Títulos com personalidade + texto limpo: **Bricolage Grotesque + Figtree**, **Space Grotesk + Manrope**, **Syne + Inter Tight**, **Unbounded + DM Sans**
  - Editorial/elegante: **Instrument Serif + Manrope**, **Fraunces + Figtree**, **Playfair Display + Source Sans 3**, **Cormorant Garamond + Manrope**
  - Ousado/condensado: **Anton + Inter Tight**, **Bebas Neue + Work Sans**, **Archivo Black + Archivo**
  - Amigável/arredondado: **Nunito + Nunito Sans**, **Baloo 2 + Quicksand**
- Regra: no máximo 2 famílias. Se a marca tem fonte própria, use a da marca.

## 3. Movimento (fator uau)

Receita: **1 entrada marcante + 1 momento de scroll + microinterações**. Animação em tudo = cara de IA.

**Entrada (primeira dobra)**
- headline revealing word by word (palavra por palavra) / line by line
- staggered reveal (elementos entrando em sequência)
- Ken Burns (zoom lento na foto do hero)
- kinetic typography (tipografia animada)
- floating 3D mockup (mockup 3D flutuando)

**Scroll**
- parallax (camadas em velocidades diferentes)
- sticky scroll storytelling (seção trava enquanto o conteúdo muda)
- scroll-triggered animation (algo acontece quando a seção aparece)
- scroll-linked progress (algo cresce/desenha conforme a rolagem: linha, ramo, gráfico, caminho no mapa)
- count-up (números que sobem)
- marquee (letreiro em loop)
- horizontal scroll section (seção que rola de lado)
- scroll-scrubbed video (vídeo que avança com a rolagem, efeito "Apple"; mais avançado)

**Profundidade e 3D**
- 3D mockup with tilt on mouse move (objeto que inclina com o mouse)
- Three.js / React Three Fiber (cenas 3D)
- Spline embed (cena 3D pronta do Spline)
- layered depth, soft shadows
- grain / noise texture (textura de granulado)
- glassmorphism (vidro fosco) — use com moderação

**Interação (microinterações)**
- hover states that feel responsive (hover com resposta)
- magnetic buttons (botão que "puxa" o cursor)
- smooth tab transitions (troca de abas suave)
- interactive quiz / calculator / before-after slider (elemento interativo que entrega valor)
- success animation / confetti (comemoração no envio do formulário)

**Bibliotecas que o Lovable instala sozinho (pode citar no prompt)**
- Framer Motion (Motion) — animações em geral
- GSAP + ScrollTrigger — scroll avançado
- Lenis — rolagem suave
- Three.js / React Three Fiber — 3D
- Componentes prontos: 21st.dev (copie o "prompt para Lovable" do componente)

**Ilustração e textura**
- flat vector illustrations (ilustração vetorial chapada)
- line illustrations (traço)
- SVG path drawing animation (desenho que se desenha)
- hand-drawn elements (elementos feitos à mão)
- duotone photos (fotos em duas cores)

## 4. Layout

- bento grid (grade de blocos de tamanhos diferentes)
- full-bleed hero (imagem de ponta a ponta)
- split screen (tela dividida)
- asymmetric layout (assimétrico)
- editorial grid (grade de revista)
- one idea per section (uma ideia por seção)
- generous whitespace (respiro generoso)
- oversized typography (tipografia gigante)

## 5. Pedidos de ajuste (verbos de direção de arte)

| Pedido | Texto pronto |
|---|---|
| Mais ousado | "A página está segura demais. Deixe [seção] mais ousada: tipografia maior, mais contraste e um elemento memorável. Não mude o conteúdo." |
| Mais calmo | "Tem efeito demais. Mantenha só a animação do hero e a de [momento principal]. Remova o resto." |
| Enxugar | "Corte 30% do texto sem perder informação. Uma ideia por seção." |
| Mais cor | "A página está apagada. Use mais a cor [X] em fundos de seção e destaques, mantendo o contraste." |
| Tipografia | "Melhore a hierarquia: títulos maiores e com mais personalidade, textos com entrelinha confortável." |
| Ritmo | "Ajuste espaçamentos: mais respiro entre seções, elementos relacionados mais próximos." |
| Polimento | "Faça uma passada crítica na página inteira: tipografia, espaçamento, contraste e tudo que parecer genérico. Não adicione funcionalidades e não mude a paleta." |
| Explorar | "Descreva três direções visuais para o hero antes de construir qualquer coisa." |
| Com limite | "[O que fazer] na seção [X]. Não mexa em [Y] nem [Z]." |
| Mobile | "Revise a página em 390 px: textos, botões e espaçamentos. Não mude o desktop." |

## 6. Checklist "cara de IA" (o que evitar)

- Gradiente roxo/azul (e texto em gradiente) sem relação com a marca
- Inter/Roboto/Arial em tudo
- Selo/rótulo em CAIXA ALTA acima de todo título (✨ NOVIDADE)
- Emoji no lugar de ícone ou logo
- Grade de cards idênticos com ícone + título + frase
- Cards dentro de cards; sombra cinza igual em tudo
- Bolhas/orbs desfocadas no fundo
- Numeração 01/02/03 sem ser uma sequência real
- Badges e chips flutuando por cima do hero
- Faixa de números sem contexto (10k+, 50+, 4.9, 100%)
- Headline clichê: "Transforme…", "Revolucione…", "Descubra os segredos…", "O futuro de…"
- Depoimentos genéricos com 5 estrelas e cargo inventado
- O mesmo fade-up em todas as seções; hover em todo card
- Fundo creme + serifada + destaque terracota quando a marca não pediu isso
