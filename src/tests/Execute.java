package tests;

import library.PairVertex;
import library.UndirectedGraph;
import mst.Prim;

public class Execute {

  /**
   * @param args
   * @throws Exception
   */
  public static void main(String[] args) throws Exception {
    // TODO Auto-generated method stub

    UndirectedGraph<Integer> intGraph = new UndirectedGraph<Integer>();
    UndirectedGraph<String> stringGraph = new UndirectedGraph<String>();
    UndirectedGraph<String> stringGraph2 = new UndirectedGraph<String>();

    intGraph.addNode(1);
    intGraph.addNode(2);
    intGraph.addNode(3);
    intGraph.addNode(4);
    intGraph.addNode(5);
    intGraph.addNode(6);
    intGraph.addNode(7);
    intGraph.addNode(8);
    intGraph.addNode(9);
    intGraph.addEdge(1, 2, 4);
    intGraph.addEdge(2, 1, 4);
    intGraph.addEdge(1, 3, 8);

    intGraph.addEdge(2, 4, 8);
    intGraph.addEdge(2, 3, 11);

    intGraph.addEdge(3, 5, 7);
    intGraph.addEdge(3, 6, 1);

    intGraph.addEdge(4, 5, 2);
    intGraph.addEdge(4, 7, 7);
    intGraph.addEdge(4, 8, 4);

    intGraph.addEdge(5, 6, 6);

    intGraph.addEdge(6, 8, 2);

    intGraph.addEdge(7, 8, 14);
    intGraph.addEdge(7, 9, 9);

    intGraph.addEdge(8, 9, 10);

    stringGraph.addNode("A");
    stringGraph.addNode("B");
    stringGraph.addNode("C");
    stringGraph.addNode("D");

    stringGraph.addEdge("A", "B", 2);
    stringGraph.addEdge("A", "C", 8);

    stringGraph.addEdge("B", "D", 1);
    stringGraph.addEdge("C", "D", 3);

    stringGraph2.addNode("A");
    stringGraph2.addNode("B");
    stringGraph2.addNode("C");
    stringGraph2.addNode("D");
    stringGraph2.addNode("E");

    stringGraph2.addEdge("A", "B", 8);
    stringGraph2.addEdge("A", "C", 5);

    stringGraph2.addEdge("B", "C", 2);
    stringGraph2.addEdge("B", "D", 15);

    stringGraph2.addEdge("C", "D", 10);
    stringGraph2.addEdge("C", "E", 5);

    stringGraph2.addEdge("D", "E", 20);

    System.out.println(" ********** Prim ********");

    mst.Prim<Integer> teste = new Prim<Integer>(intGraph);
    teste.generateMST();
    System.out.println("Nó inicial: " + teste.getStartNode());
    for (PairVertex<Integer> node : teste.getSpanningTree()) {
      System.out.println(node.getOne() + " - " + node.getTwo() + " : " + node.getCost());
    }
    System.out.println("Custo da MST:" + teste.getCost());

    System.out.println();
    mst.Prim<String> teste2 = new mst.Prim<String>(stringGraph);
    teste2.generateMST();
    System.out.println("Nó inicial: " + teste2.getStartNode());
    for (PairVertex<String> parVetex : teste2.getSpanningTree()) {
      System.out.println(parVetex.getOne() + " - " + parVetex.getTwo() + " : " + parVetex.getCost());
    }
    System.out.println("Custo da MST:" + teste2.getCost());

    System.out.println();
    mst.Prim<String> teste3 = new mst.Prim<String>(stringGraph2);
    teste3.generateMST();
    System.out.println("Nó inicial: " + teste3.getStartNode());
    for (PairVertex<String> parVetex : teste3.getSpanningTree()) {
      System.out.println(parVetex.getOne() + " - " + parVetex.getTwo() + " : " + parVetex.getCost());
    }
    System.out.println("Custo da MST:" + teste3.getCost());

    System.out.println(" ********** Round Robin ********");
  }
}
