# Aula: IA para criação de LPs com Lovable · Agência Mestre

> **Ideia central:** *Prompt bom é briefing bom.* A IA é um freela brilhante que nunca ouviu falar do seu cliente; se você não decide, ela decide pela média. A fórmula **BRIEF** (Base, Resultado, Identidade, Estrutura, Fator uau + Carimbo) transforma o briefing que a agência já sabe fazer num prompt que gera LP com cara de marca.

30 minutos + perguntas · público geral da agência.

---

## Links (páginas privadas, só você acessa até compartilhar)

| O quê | Link |
|---|---|
| **Apresentação** (deck em HTML, identidade Mestre) | https://claude.ai/artifact/CbGVEH9fvDGhSpeQjhFVFR |
| LP da Vingô, versão BRIEF (cinematográfica) | https://claude.ai/artifact/LfUyk1eTUr1QZ4zfbUFf89 |
| LP da Vingô, versão "cara de IA" | https://claude.ai/artifact/X2fdTrpPeumEWK4NeB5tfg |
| Brandbook da Vingô | https://claude.ai/artifact/Mxmyr1seAGc2vurbGd9n11 |

Para mostrar a alguém fora da sua conta, use o menu Share de cada página. O deck também roda local: abra `apresentacao/index.html` no Chrome.

---

## O que tem aqui

| Arquivo / pasta | Para quê |
|---|---|
| `apresentacao/index.html` + `assets/` | **O deck.** 30 slides + 6 extras, transição diagonal "//", entradas animadas, prompt com marca-texto, demos animadas, vídeos e notas do apresentador (tecla N) |
| `02-guia-da-apresentacao.md` | **Guia resumido:** como usar o deck, tempos e o que falar em cada slide |
| `01-fundamentos-da-pesquisa.md` | A pesquisa que sustenta a aula, com fontes |
| `03-exemplo-vingo-prompts.md` | Os dois cases (PHE real e Vingô didático), o prompt genérico, o prompt BRIEF completo, o mapa "trecho do prompt → resultado" e o inventário de capturas |
| `04-faq-possiveis-duvidas.md` | Respostas para as dúvidas prováveis (base dos slides extras) |
| `exemplos/vingo-brandbook/` | Brandbook da marca fictícia (HTML + PDF) e logos em SVG |
| `exemplos/lp-generica/` | A LP "cara de IA" |
| `exemplos/lp-espetacular/` | A LP BRIEF: livro 3D em WebGL entre folhas 3D, manifesto que acende, números fixos, letreiro, capítulos na horizontal, teste de luz, neon e marca gigante no rodapé |
| `exemplos/capturas/` | Prints e vídeos das LPs da Vingô e das duas versões do PHE |
| `05-material-pos-aula/guia-de-bolso-brief.md` | A "cola" para mandar no grupo |
| `05-material-pos-aula/assistente-brief/` | **Assistente BRIEF:** Skill do Claude (`.zip` pronto) e Gem do Gemini (instruções + 3 arquivos), com guia de instalação e casos de teste |
| `05-material-pos-aula/bonus-lovable-da-agencia/` | Instructions do workspace (padrão Mestre) e duas Skills do Lovable (`/lp-brief`, `/revisao-lp`) |

---

## Checklist antes da aula

1. **Abrir o deck** e passar por ele com as notas abertas (N). Siga `02-guia-da-apresentacao.md`.
2. **Preencher o nome** na capa: procure "[Seu nome]" em `apresentacao/index.html`.
3. **Criar o Gem** (10 min) com `05-material-pos-aula/assistente-brief/como-instalar-e-usar.md`. Rode os 4 casos de teste e coloque o link no slide 28 (procure "Link do Gem").
4. **Ensaiar uma vez cronometrando:** chegar no slide 21 até 19:30. Se apertar, pule os slides 7, 15 e 26.
5. **Deixar a LP da Vingô aberta numa aba** para o slide 24.
6. **(Opcional, 20 min)** Rodar o prompt BRIEF no Lovable com o brandbook anexado (`03-exemplo-vingo-prompts.md`, seção 7) para ter também um resultado 100% Lovable da Vingô.

Se mudar textos do deck, mantenha as regras da Mestre: título termina com ponto, sem travessão, Outfit, tinta e papel.

---

## Mensagem pronta para o grupo (pós-aula)

> Pessoal, obrigado pela aula! Aqui está o material:
> 📌 **Guia de bolso BRIEF**: a fórmula, o modelo de prompt, as palavras que destravam o uau e os pedidos de ajuste → [anexar guia]
> 🤖 **Assistente BRIEF no Gemini**: cole o briefing do cliente e receba o prompt pronto para o Lovable → [link do Gem]
> 🤖 **Versão Claude** (Skill): Configurações → Capabilities → Skills → enviar o arquivo → [anexar brief-lovable.zip]
> 💡 Desafio: na próxima LP, testem o BRIEF e mandem o antes e depois aqui!
> Prompt bom é briefing bom.

---

## Decisões tomadas (e por quê)

- **O gancho é o seu case do PHE.** As duas páginas da pós em Ciências da Obesidade (mesmo cliente, mesmo texto, uma "cara de IA" e uma cinematográfica) provam a tese com trabalho da casa. A Vingô entra depois, para dissecar o prompt bloco a bloco.
- **O fator uau virou "permissão + direção + coerência".** O PHE mostrou que uma LP pode ter muitos momentos de movimento e continuar sofisticada quando todos nascem da marca (o símbolo vira 3D, linha, neon e rodapé). Isso refinou a pesquisa, que alertava contra efeitos soltos. O que é cara de IA é o efeito genérico repetido em toda seção, não a ambição.
- **A LP espetacular foi refeita no patamar do PHE:** cena 3D em WebGL (Three.js), GSAP ScrollTrigger e rolagem suave (Lenis). Ela tem versão estática para "reduzir movimento" e o hero adaptado no celular.
- **O deck segue o design system da Mestre:** tinta e papel, Outfit de 300 a 900, raio zero, sem sombra, palavra fantasma, faixas diagonais e granulado no escuro. Os prints, vídeos e demos levam a cor. A transição entre slides usa as faixas diagonais do "//" do logo.
- **Marca fictícia "Vingô":** o primeiro nome, "Brota", coincidia com uma empresa real do mesmo ramo.
- **Contexto > persona:** confirmado pelo estudo da Wharton (2025). Valida a sua prática de colocar tudo sobre o cliente no prompt.
