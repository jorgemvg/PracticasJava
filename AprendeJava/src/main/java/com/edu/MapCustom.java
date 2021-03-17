package com.edu;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MapCustom {

	private Object key;
	private Object value;

	private List<MapCustom> lista = new ArrayList<>();

	public MapCustom() {
	}

	public MapCustom(Object key, Object value) {
		this.key = key;
		this.value = value;
	}

	protected void put(Object key, Object value) {
		MapCustom map = new MapCustom(key, value);
		if (lista.contains(map)) {
			lista.remove(map);
		}

		lista.add(map);
	}

	protected Object get(Object key) {
		int index = lista.indexOf(new MapCustom(key, null));
		if ( index == -1 ) {
			return null;
		}
		return (lista.get(index)).getValue();
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.key);
	}

	@Override
	public boolean equals(Object obj) {
		boolean equals = false;
		if (this == obj) {
			equals = true;
		}
		if ( this.key.equals(((MapCustom)obj).getKey()) ) {
			equals = true;
		}
		return equals;
	}

	@Override
	public String toString() {
		
		String text = null;
		if ( lista != null && !lista.isEmpty() ) {
			StringBuffer st = new StringBuffer();
			st.append("{");
			for (MapCustom m : lista) {
				st.append( m.key ).append( "=" ).append(m.value ).append(", ");
			}
			text = st.toString();
			text = text.substring(0, text.length() - 2) +"}";
		}

		return text;
	}

	public Object getKey() {
		return key;
	}

	public void setKey(Object key) {
		this.key = key;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

}
