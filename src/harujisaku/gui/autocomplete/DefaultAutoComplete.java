package harujisaku.gui.autocomplete;

import harujisaku.gui.autocomplete.*;
import harujisaku.text.*;
/**
 * デフォルトの自動補完文字列を作成するエンジン
 */
public class DefaultAutoComplete extends AutoCompleteEngin {
	/**
	 * デフォルトコンストラクタ
	 */
	public DefaultAutoComplete(){
		super();
	}
	/**
	 * 自動補完文字列を定義するクラスを設定できるコンストラクタ
	 * @param a 自動補完文字列を定義するクラス
	 */
	public DefaultAutoComplete(SuggestString a){
		super(a);
	}
}