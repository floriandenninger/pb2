package defpackage;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import java.util.Calendar;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acgj extends bv {
    public DatePickerDialog.OnDateSetListener ae;
    public Calendar af;

    @Override // defpackage.bv
    public final Dialog oq(Bundle bundle) {
        return new DatePickerDialog(C(), this.ae, this.af.get(1), this.af.get(2), this.af.get(5));
    }
}
