/* ###
* © 2022 The Johns Hopkins University Applied Physics Laboratory LLC
* (JHU/APL).
*
* NO WARRANTY, NO LIABILITY. THIS MATERIAL IS PROVIDED “AS IS.” JHU/APL
* MAKES NO REPRESENTATION OR WARRANTY WITH RESPECT TO THE PERFORMANCE OF
* THE MATERIALS, INCLUDING THEIR SAFETY, EFFECTIVENESS, OR COMMERCIAL
* VIABILITY, AND DISCLAIMS ALL WARRANTIES IN THE MATERIAL, WHETHER
* EXPRESS OR IMPLIED, INCLUDING (BUT NOT LIMITED TO) ANY AND ALL IMPLIED
* WARRANTIES OF PERFORMANCE, MERCHANTABILITY, FITNESS FOR A PARTICULAR
* PURPOSE, AND NON-INFRINGEMENT OF INTELLECTUAL PROPERTY OR OTHER THIRD
* PARTY RIGHTS. ANY USER OF THE MATERIAL ASSUMES THE ENTIRE RISK AND
* LIABILITY FOR USING THE MATERIAL. IN NO EVENT SHALL JHU/APL BE LIABLE
* TO ANY USER OF THE MATERIAL FOR ANY ACTUAL, INDIRECT, CONSEQUENTIAL,
* SPECIAL OR OTHER DAMAGES ARISING FROM THE USE OF, OR INABILITY TO USE,
* THE MATERIAL, INCLUDING, BUT NOT LIMITED TO, ANY DAMAGES FOR LOST
* PROFITS.
*
* This material is based upon work supported by the Defense Advanced Research
* Projects Agency (DARPA) and Naval Information Warfare Center Pacific (NIWC Pacific)
* under Contract Number N66001-20-C-4024.
*
* HAVE A NICE DAY.
*/

package codecutguiv2;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import ghidra.program.model.symbol.Namespace;

public class SharedListSelectionListener implements ListSelectionListener {
	
	private Namespace namespace;
	private SymbolProvider provider;
	
	SharedListSelectionListener(Namespace namespace, SymbolProvider provider) {
		this.namespace = namespace;
		this.provider = provider;
	}
	
	public void valueChanged(ListSelectionEvent e) {
		//ListSelectionModel lsm = (ListSelectionModel)e.getSource();
		provider.clearOtherSelections(this.namespace);
		
	}
}
