package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.ec.js")
public class PhoneECFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhoneECFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_EC);
    }

}
