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
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;


public class BFS {

	public State exec(State init_State) {
		if (init_State.isGoal()) {
			return init_State;
		}
		Queue<State> front= new LinkedList<State>();	// FIFO queue
		Set<State> explored = new HashSet<State>();
		front.add(init_State);
		while (true) {
			if (front.isEmpty()) {
				return null;	// failure
			}
			State state = front.poll();
			explored.add(state);
			List<State> successors = state.generateNextState();
			for (State child : successors) {
				if (!explored.contains(child) || !front.contains(child)) {
					if (child.isGoal()) {
						return child;
					}
					front.add(child);
				}
			}
		}
	}
}