package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.ma.js")
public class PhoneMAFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneMAFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_MA);
    }

}
