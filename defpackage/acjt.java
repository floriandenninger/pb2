package defpackage;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.format.DateFormat;
import java.util.Calendar;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acjt extends bv {
    public TimePickerDialog.OnTimeSetListener ae;
    public Calendar af;

    @Override // defpackage.bv
    public final Dialog oq(Bundle bundle) {
        return new TimePickerDialog(C(), this.ae, this.af.get(11), this.af.get(12), DateFormat.is24HourFormat(C()));
    }
}
