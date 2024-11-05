# arvore_binaria
Este código é uma implementação de uma árvore binária, que é uma estrutura de dados usada para organizar números de forma eficiente. Ele permite adicionar números, contar quantas vezes cada número foi inserido, e remover números de maneira inteligente, mantendo a estrutura ordenada. Além disso, oferece três formas diferentes de visualizar os números armazenados, dependendo da ordem em que você deseja vê-los.


1. Estrutura da Árvore Binária de Busca (ABB):
A árvore é formada por nós, onde cada nó contém um número (element), referências para o nó à esquerda (left) e à direita (right), e um contador (contador) que guarda o número de vezes que um determinado número foi inserido.
2. Inserção de Elementos:
O método insert(int x) insere um número na árvore.
Se o número já existir, o contador daquele nó é incrementado. Isso permite que a árvore registre múltiplas inserções do mesmo número sem duplicar os nós.
3. Impressão da Árvore:
O código possui três formas de imprimir os elementos da árvore:

Em Ordem (In-order): Visita os nós na ordem crescente (esquerda → nó → direita).
Pré-Ordem (Pré-order): Visita os nós primeiro (nó → esquerda → direita).
Pós-Ordem (Pós-order): Visita os nós depois (esquerda → direita → nó).
O método print(int ordem) recebe um número (ordem) que define qual tipo de percurso a ser feito (0, -1 ou 1) e chama a função correspondente para imprimir os elementos de acordo com a ordem desejada.

4. Remoção de Elementos:
O método remove(int x) remove um valor da árvore.
Se o valor estiver presente mais de uma vez, apenas o contador é decrementado.
Se o valor aparecer apenas uma vez, o nó é removido fisicamente da árvore.
Quando um nó com dois filhos é removido, ele é substituído pelo menor valor da subárvore direita.
5. Exemplo de Uso:
O código principal (ArvoreAPP) realiza as seguintes operações:

Insere uma série de números na árvore.
Imprime os números da árvore em três ordens diferentes (em ordem, pré-ordem e pós-ordem).
Depois de imprimir, remove alguns números e imprime novamente a árvore para mostrar como a estrutura muda.
