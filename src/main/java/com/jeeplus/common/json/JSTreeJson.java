/**
 * Copyright &copy; 2018-2020 <a href="http://www.yinbin.ink/">青岛前途软件技术</a> All rights reserved.
 */
package com.jeeplus.common.json;

import java.util.List;

/**
 * 数据Entity类
 * 
 * @author jeeplus
 * @version 2017-05-16
 */
public abstract class JSTreeJson {


	private String id;
	private String icon;
	private String text;
	private String type;
	private List<JSTreeJson> children;
	private State state;

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@SuppressWarnings("rawtypes")
	public List<JSTreeJson> getChildren() {
		return children;
	}

	public void setChildren(@SuppressWarnings("rawtypes") List<JSTreeJson> children) {
		this.children = children;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}

class State {
	boolean opened; // is the node open
	boolean disabled; // is the node disabled
	boolean selected; // is the node selected

	public boolean isOpened() {
		return opened;
	}

	public void setOpened(boolean opened) {
		this.opened = opened;
	}

	public boolean isDisabled() {
		return disabled;
	}

	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

}