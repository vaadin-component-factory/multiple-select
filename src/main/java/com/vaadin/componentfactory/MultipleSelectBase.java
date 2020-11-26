package com.vaadin.componentfactory;

import com.vaadin.flow.component.AbstractSinglePropertyField;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Focusable;
import com.vaadin.flow.component.HasStyle;
import com.vaadin.flow.component.Synchronize;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JavaScript;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.function.SerializableBiFunction;
import com.vaadin.flow.shared.Registration;

@Tag("vcf-multi-select")
@JavaScript("@vaadin-component-factory/vcf-multi-select/src/vcf-multi-select.js")
@NpmPackage(value = "@vaadin-component-factory/vcf-multi-select", version = "^1.2.0")
public abstract class MultipleSelectBase<C extends MultipleSelectBase<C, T, V>, T, V>
        extends AbstractSinglePropertyField<C, V>
        implements HasStyle, Focusable<C> {

    /**
     * <p>
     * Specify that this control should have input focus when the page loads.
     * <p>
     * This property is not synchronized automatically from the client side, so
     * the returned value may not be the same as in client side.
     * </p>
     *
     * @return the {@code autofocus} property from the webcomponent
     */
    protected boolean isAutofocusBoolean() {
        return getElement().getProperty("autofocus", false);
    }

    /**
     * <p>
     * Specify that this control should have input focus when the page loads.
     * </p>
     *
     * @param autofocus
     *            the boolean value to set
     */
    protected void setAutofocus(boolean autofocus) {
        getElement().setProperty("autofocus", autofocus);
    }

    /**
     * <p>
     * If true, the user cannot interact with this element.
     * <p>
     * This property is not synchronized automatically from the client side, so
     * the returned value may not be the same as in client side.
     * </p>
     *
     * @return the {@code disabled} property from the webcomponent
     */
    protected boolean isDisabledBoolean() {
        return getElement().getProperty("disabled", false);
    }

    /**
     * <p>
     * If true, the user cannot interact with this element.
     * </p>
     *
     * @param disabled
     *            the boolean value to set
     */
    protected void setDisabled(boolean disabled) {
        getElement().setProperty("disabled", disabled);
    }

    /**
     * <p>
     * Set when the select is open
     * <p>
     * This property is synchronized automatically from client side when a
     * 'opened-changed' event happens.
     * </p>
     *
     * @return the {@code opened} property from the webcomponent
     */
    @Synchronize(property = "opened", value = "opened-changed")
    protected boolean isOpenedBoolean() {
        return getElement().getProperty("opened", false);
    }

    /**
     * <p>
     * Set when the select is open
     * </p>
     *
     * @param opened
     *            the boolean value to set
     */
    protected void setOpened(boolean opened) {
        getElement().setProperty("opened", opened);
    }

    /**
     * <p>
     * The error message to display when the select value is invalid
     * <p>
     * This property is not synchronized automatically from the client side, so
     * the returned value may not be the same as in client side.
     * </p>
     *
     * @return the {@code errorMessage} property from the webcomponent
     */
    protected String getErrorMessageString() {
        return getElement().getProperty("errorMessage");
    }

    /**
     * <p>
     * The error message to display when the select value is invalid
     * </p>
     *
     * @param errorMessage
     *            the String value to set
     */
    protected void setErrorMessage(String errorMessage) {
        getElement().setProperty("errorMessage",
                errorMessage == null ? "" : errorMessage);
    }

    /**
     * <p>
     * String used for the label element.
     * <p>
     * This property is not synchronized automatically from the client side, so
     * the returned value may not be the same as in client side.
     * </p>
     *
     * @return the {@code label} property from the webcomponent
     */
    protected String getLabelString() {
        return getElement().getProperty("label");
    }

    /**
     * <p>
     * String used for the label element.
     * </p>
     *
     * @param label
     *            the String value to set
     */
    protected void setLabel(String label) {
        getElement().setProperty("label", label == null ? "" : label);
    }

    /**
     * <p>
     * The current required state of the select. True if required.
     * <p>
     * This property is not synchronized automatically from the client side, so
     * the returned value may not be the same as in client side.
     * </p>
     *
     * @return the {@code required} property from the webcomponent
     */
    protected boolean isRequiredBoolean() {
        return getElement().getProperty("required", false);
    }

    /**
     * <p>
     * The current required state of the select. True if required.
     * </p>
     *
     * @param required
     *            the boolean value to set
     */
    protected void setRequired(boolean required) {
        getElement().setProperty("required", required);
    }

    /**
     * <p>
     * Set to true if the value is invalid.
     * <p>
     * This property is synchronized automatically from client side when a
     * 'invalid-changed' event happens.
     * </p>
     *
     * @return the {@code invalid} property from the webcomponent
     */
    @Synchronize(property = "invalid", value = "invalid-changed")
    protected boolean isInvalidBoolean() {
        return getElement().getProperty("invalid", false);
    }

    /**
     * <p>
     * Set to true if the value is invalid.
     * </p>
     *
     * @param invalid
     *            the boolean value to set
     */
    protected void setInvalid(boolean invalid) {
        getElement().setProperty("invalid", invalid);
    }

    /**
     * <p>
     * The name of this element.
     * <p>
     * This property is not synchronized automatically from the client side, so
     * the returned value may not be the same as in client side.
     * </p>
     *
     * @return the {@code name} property from the webcomponent
     */
    protected String getNameString() {
        return getElement().getProperty("name");
    }

    /**
     * <p>
     * The name of this element.
     * </p>
     *
     * @param name
     *            the String value to set
     */
    protected void setName(String name) {
        getElement().setProperty("name", name == null ? "" : name);
    }

    /**
     * <p>
     * A hint to the user of what can be entered in the control. The placeholder
     * will be displayed in the case that there is no item selected, or the
     * selected item has an empty string label, or the selected item has no
     * label and it's DOM content is empty.
     * <p>
     * This property is not synchronized automatically from the client side, so
     * the returned value may not be the same as in client side.
     * </p>
     *
     * @return the {@code placeholder} property from the webcomponent
     */
    protected String getPlaceholderString() {
        return getElement().getProperty("placeholder");
    }

    /**
     * <p>
     * A hint to the user of what can be entered in the control. The placeholder
     * will be displayed in the case that there is no item selected, or the
     * selected item has an empty string label, or the selected item has no
     * label and it's DOM content is empty.
     * </p>
     *
     * @param placeholder
     *            the String value to set
     */
    protected void setPlaceholder(String placeholder) {
        getElement().setProperty("placeholder",
                placeholder == null ? "" : placeholder);
    }

    /**
     * <p>
     * When present, it specifies that the element is read-only.
     * <p>
     * This property is not synchronized automatically from the client side, so
     * the returned value may not be the same as in client side.
     * </p>
     *
     * @return the {@code readonly} property from the webcomponent
     */
    protected boolean isReadonlyBoolean() {
        return getElement().getProperty("readonly", false);
    }

    /**
     * <p>
     * When present, it specifies that the element is read-only.
     * </p>
     *
     * @param readonly
     *            the boolean value to set
     */
    protected void setReadonly(boolean readonly) {
        getElement().setProperty("readonly", readonly);
    }

    /**
     * <p>
     * When true, it indicates that all selected items will be shown
     * comma-separated (with ellipsis if more items are present than fits the
     * component).
     * <p>
     * If false, it indicates that after the first selected item, additional
     * selected items will be abbreviated (showing only the number of
     * additionally selected items between brackets).
     * <p>
     * This property is not synchronized automatically from the client side, so
     * the returned value may not be the same as in client side.
     * </p>
     *
     * @return the {@code displayAllSelected} property from the webcomponent
     */
    protected boolean isDisplayAllSelected() {
        return getElement().getProperty("displayAllSelected", false);
    }

    /**
     * <p>
     * If set to true, all selected items will be shown comma-separated (with
     * ellipsis if more items are present than fits the component).
     *
     * When set to false (default), it indicates that after the first selected
     * item, additional selected items will be abbreviated (showing only the
     * number of additionally selected items between brackets).
     * </p>
     *
     * @param displayAllSelected
     *            the boolean value to set
     * @see #setExtraItemsCountText()
     */
    protected void setDisplayAllSelected(boolean displayAllSelected) {
        getElement().setProperty("displayAllSelected", displayAllSelected);
    }

    /**
     * <p>
     * Sets the text shown after the count when more than a single item is
     * selected.
     * </p>
     *
     * @param singularString
     *            the text shown when only on extra item is selected.
     * @param pluralString
     *            the text shown when two or more extra items selected.
     * @see #setDisplayAllSelected(boolean displayAllSelected)
     */
    protected void setExtraItemsCountText(String singularString,
            String pluralString) {
        getElement().executeJs("this.setExtraItemsCountText($0, $1);",
                singularString, pluralString);
    }

    /**
     * <p>
     * Manually invoke existing renderer.
     * </p>
     */
    protected void render() {
        getElement().callFunction("render");
    }

    public static class OpenedChangeEvent<C extends MultipleSelectBase<C, ?, ?>>
            extends ComponentEvent<C> {
        private final boolean opened;

        public OpenedChangeEvent(C source, boolean fromClient) {
            super(source, fromClient);
            this.opened = source.isOpenedBoolean();
        }

        public boolean isOpened() {
            return opened;
        }
    }

    /**
     * Adds a listener for {@code opened-changed} events fired by the
     * webcomponent.
     *
     * @param listener
     *            the listener
     * @return a {@link Registration} for removing the event listener
     */
    protected Registration addOpenedChangeListener(
            ComponentEventListener<OpenedChangeEvent<C>> listener) {
        return getElement()
                .addPropertyChangeListener("opened",
                        event -> listener.onComponentEvent(
                                new OpenedChangeEvent<>((C) this,
                                        event.isUserOriginated())));
    }

    public static class InvalidChangeEvent<C extends MultipleSelectBase<C, ?, ?>>
            extends ComponentEvent<C> {
        private final boolean invalid;

        public InvalidChangeEvent(C source, boolean fromClient) {
            super(source, fromClient);
            this.invalid = source.isInvalidBoolean();
        }

        public boolean isInvalid() {
            return invalid;
        }
    }

    /**
     * Adds a listener for {@code invalid-changed} events fired by the
     * webcomponent.
     *
     * @param listener
     *            the listener
     * @return a {@link Registration} for removing the event listener
     */
    protected Registration addInvalidChangeListener(
            ComponentEventListener<InvalidChangeEvent<C>> listener) {
        return getElement()
                .addPropertyChangeListener("invalid",
                        event -> listener.onComponentEvent(
                                new InvalidChangeEvent<>((C) this,
                                        event.isUserOriginated())));
    }

    /**
     * Adds the given components as children of this component at the slot
     * 'prefix'.
     *
     * @param components
     *            The components to add.
     * @see <a href=
     *      "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot">MDN
     *      page about slots</a>
     * @see <a href=
     *      "https://html.spec.whatwg.org/multipage/scripting.html#the-slot-element">Spec
     *      website about slots</a>
     */
    protected void addToPrefix(Component... components) {
        for (Component component : components) {
            component.getElement().setAttribute("slot", "prefix");
            getElement().appendChild(component.getElement());
        }
    }

    /**
     * Removes the given child components from this component.
     *
     * @param components
     *            The components to remove.
     * @throws IllegalArgumentException
     *             if any of the components is not a child of this component.
     */
    protected void remove(Component... components) {
        for (Component component : components) {
            if (getElement().equals(component.getElement().getParent())) {
                component.getElement().removeAttribute("slot");
                getElement().removeChild(component.getElement());
            } else {
                throw new IllegalArgumentException("The given component ("
                        + component + ") is not a child of this component");
            }
        }
    }

    /**
     * Removes all contents from this component, this includes child components,
     * text content as well as child elements that have been added directly to
     * this component using the {@link Element} API.
     */
    protected void removeAll() {
        getElement().getChildren()
                .forEach(child -> child.removeAttribute("slot"));
        getElement().removeAllChildren();
    }

    /**
     * Constructs a new MultipleSelectBase component with the given arguments.
     *
     * @param propertyName
     *            the name of the element property to use
     * @param defaultValue
     *            the default value to use if the value isn't defined
     * @param elementPropertyType
     *            the type of the element property
     * @param presentationToModel
     *            a function that converts a string value to a model value
     * @param modelToPresentation
     *            a function that converts a model value to a string value
     * @param <P>
     *            the property type
     */
    public <P> MultipleSelectBase(String propertyName, V defaultValue,
            Class<P> elementPropertyType,
            SerializableBiFunction<C, P, V> presentationToModel,
            SerializableBiFunction<C, V, P> modelToPresentation) {
        super(propertyName, defaultValue, elementPropertyType,
                presentationToModel, modelToPresentation);
    }

}
