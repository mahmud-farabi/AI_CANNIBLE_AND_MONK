/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai_proj_0;

/**
 *
 * @author HP
 */
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author MAHMUD FARABI
 */
public class AI_PROJ_0 {

    
    public static void main(String[] args) {
        
        
        State init_State = new State (3, 3, Position.LEFT, 0, 0);//shobai re left a rakhsI
        BFS search = new BFS();
	State solution = search.exec(init_State);
	printSolution(solution);
        JFrame frame = new JFrame("MISSIONARY AND CANNBILES");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        HandlingEvents ex = new HandlingEvents();
        frame.getContentPane().add(ex);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
        ex.requestFocus();
        
    }

    private static void printSolution(State solution) {
        
                
                
		if (solution == null) {
			System.out.print("dude you are killing the missionaries\n");
		}
                else 
                {
			//System.out.println("\nSolution (cannibalLeft,missionaryLeft,boat,cannibalRight,missionaryRight): ");
			ArrayList<State> path = new ArrayList<State>();
                        
			State state = solution;//cause amk next parent state generate korte hobe
                        
			while(state != null) {
				path.add(state);
				state = state.parentState;
			}
                        
			int depth = path.size() - 1;
			for (int i = depth; i >= 0; i--) {
				state = path.get(i);
				if (state.isGoal()) {
					System.out.print(state.toString());
				} else {
					System.out.print(state.toString() +"\n"+"     |\n");
                                        System.out.print("     V\n");
				}
			}
                        depth-=1;
			System.out.println("\nDepth: " + depth);
		}
    }
    
}