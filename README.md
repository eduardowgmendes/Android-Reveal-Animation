# Reveal View
This is a simple library that's create a Simple Reveal Animation on arbitrary `Views`

### Exemplo de Uso

![Example Case](https://raw.githubusercontent.com/eduardowgmendes/RevealAnimationClass/master/screenshots/example_remove_items.gif)

### Estrutura 
A biblioteca possui apenas uma classe utilitária com dois métodos estáticos: 

### `public static void obscure(View v);`
Método estático que esconde a `view` deixando-a em um estado invisível.
```java
  RevealViewUtils.obscure(View view);
```

### `public static void reveal(View v);`
Método estático que faz a `view` voltar a visibilidade normal. 
```java
  RevealViewUtils.reveal(View view);
```

### Considerações
Ainda há muita coisa a ser feita para aprimorar mais a biblioteca como por exemplo aplicar a animação de um ponto customizável da `view` - **atualmente a animação de `reveal` se inicia no centro e se propaga para as beiradas da view sendo o contrário para `obscure`.**    
