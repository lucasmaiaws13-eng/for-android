# Exemplo completo: do briefing bagunçado ao prompt BRIEF

Use este exemplo como referência de **nível de qualidade e formato** da resposta. Não copie o conteúdo para outros clientes.

## Entrada (como o usuário costuma mandar)

> preciso de uma lp pro ebook da vingô, aquela loja de plantas de sp. o ebook chama selva de apê, é tipo um guia pra quem mata planta kkk. 52 paginas, quem escreveu foi a marina okabe que é bióloga e sócia. a campanha vai rodar insta e pinterest. querem lead pra régua de email e querem saber quantas plantas a pessoa tem pra segmentar. tenho o brandbook em pdf. cores: verde escuro 0E3B2C, verde limão C9F264, rosa FF6F91, fundo verde claro EEF4E6. fonte bricolage grotesque e figtree. eles são bem humorados. capitulos: luz, rega, 12 plantas indestrutíveis, vaso e terra, pragas, pets, calendário. bonus calendário de rega

## Raciocínio esperado (interno, não precisa mostrar)
- B: completo o suficiente. Público não foi dito → assumir pelo contexto (25–40, apê, já perdeu plantas) e declarar como suposição.
- R: lead para régua + segmentação por nº de plantas → formulário com nome, e-mail e a pergunta; LGPD; tráfego mobile → CTA fixo.
- I: tem brandbook → usar os HEX e fontes exatamente; para uma vitrine cinematográfica, usar o fundo escuro da própria paleta (Noite) e a Bricolage em pesos finos; sugerir anexar PDF + logo.
- E: estrutura de isca digital (ver segmentos.md) adaptada ao humor da marca.
- F: assunto = plantas; o universo da marca são as folhas. Logo: e-book em 3D entre folhas 3D, manifesto que acende, números fixos, capítulos na horizontal com ilustrações em traço, neon de folha no CTA.
- Nada a perguntar de crítico → entregar direto, com suposições listadas.

## Saída ideal

**1. Prompt principal** (cole no Lovable; anexe o brandbook em PDF e o logo)

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
