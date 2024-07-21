# Exercício Avaliativo 01 DEOO

Dupla: Elizabeth Bricce e Lucas Alcantara.

## Explicação :

O objeto Builder precisa ser instanciado duas vezes para criar duas instâncias diferentes de Pizza, cada uma com uma configuração diferentes. Cada instância de Builder tem seu próprio estado interno, se não for instanciado um novo objeto 
as configurações do primeiro Builder seriam reutilizadas ao chamar o método build(), resultando em uma pizza nova, porém, com alguns valores da anterior. A criação de uma nova instância de Builder garante que as configurações possam ser redefinidas, permitindo a criação de diferentes objetos Pizza com propriedades únicas, sem interferir nas configurações de outras instâncias. 

