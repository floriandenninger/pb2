package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import com.google.android.youtube.R;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wae extends way {
    public wan ae;
    private final String[] aj;
    private ViewGroup ak;
    private NumberPicker al;
    private NumberPicker am;
    private NumberPicker an;
    private boolean ao;
    private final Calendar ag = new GregorianCalendar(Locale.getDefault());
    private final Calendar ah = new GregorianCalendar(1900, 0, 1);
    private final wad ap = new wad(this, 2);
    private final wad ai = new wad(this, 0);
    private final wad aq = new wad(this, 1);
    public final Calendar af = new GregorianCalendar(Locale.getDefault());

    public wae() {
        String[] strArr = new String[12];
        String[] shortMonths = new DateFormatSymbols().getShortMonths();
        if (Character.isDigit(shortMonths[0].charAt(0))) {
            int i = 0;
            while (i < 12) {
                int i2 = i + 1;
                strArr[i] = String.format("%d", Integer.valueOf(i2));
                i = i2;
            }
        } else {
            amkq.E(shortMonths.length >= 12);
            for (int i3 = 0; i3 < 12; i3++) {
                strArr[i3] = shortMonths[i3];
            }
        }
        this.aj = strArr;
    }

    @Override // defpackage.ce
    public final void S(Bundle bundle) {
        super.S(bundle);
        if (bundle != null) {
            this.af.setTimeInMillis(bundle.getLong("birthday_picker_millis"));
            aG();
        }
    }

    public final int aF() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(Locale.getDefault());
        gregorianCalendar.setTimeInMillis(this.af.getTimeInMillis());
        gregorianCalendar.add(2, -1);
        return gregorianCalendar.getActualMaximum(5);
    }

    public final void aG() {
        if (this.af.after(this.ag)) {
            this.af.setTimeInMillis(this.ag.getTimeInMillis());
        } else if (this.af.before(this.ah)) {
            this.af.setTimeInMillis(this.ah.getTimeInMillis());
        }
        if (this.ao) {
            this.af.set(1, this.m.getInt("birthday_picker_year"));
        } else {
            this.al.setValue(this.af.get(1));
        }
        this.am.setValue(this.af.get(2));
        if (this.af.get(5) < 15) {
            this.an.setMaxValue(aF());
        } else {
            this.an.setMaxValue(this.af.getActualMaximum(5));
        }
        this.an.setValue(this.af.get(5));
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        bundle.putLong("birthday_picker_millis", this.af.getTimeInMillis());
    }

    @Override // defpackage.bv, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.ae.g();
    }

    @Override // defpackage.bv
    public final Dialog oq(Bundle bundle) {
        Bundle bundle2 = this.m;
        View inflate = C().getLayoutInflater().inflate(R.layout.channel_creation_birthday_picker, (ViewGroup) null, false);
        this.ak = (ViewGroup) inflate.findViewById(R.id.birthday_picker_layout);
        NumberPicker numberPicker = (NumberPicker) inflate.findViewById(R.id.year);
        this.al = numberPicker;
        numberPicker.setSaveFromParentEnabled(false);
        this.al.setOnValueChangedListener(this.ap);
        boolean z = bundle2.getBoolean("birthday_picker_hide_year");
        this.ao = z;
        if (z) {
            this.al.setVisibility(8);
        } else {
            this.al.setMaxValue(this.ag.get(1));
            this.al.setMinValue(this.ah.get(1));
        }
        NumberPicker numberPicker2 = (NumberPicker) inflate.findViewById(R.id.month);
        this.am = numberPicker2;
        numberPicker2.setSaveFromParentEnabled(false);
        this.am.setOnValueChangedListener(this.ai);
        this.am.setMinValue(0);
        this.am.setMaxValue(11);
        this.am.setDisplayedValues(this.aj);
        NumberPicker numberPicker3 = (NumberPicker) inflate.findViewById(R.id.day);
        this.an = numberPicker3;
        numberPicker3.setSaveFromParentEnabled(false);
        this.an.setOnValueChangedListener(this.aq);
        this.an.setMinValue(1);
        String bestDateTimePattern = DateFormat.getBestDateTimePattern(Locale.getDefault(), "dMy");
        if (bestDateTimePattern != null && !bestDateTimePattern.equals("dMy") && bestDateTimePattern.indexOf(100) != -1 && bestDateTimePattern.indexOf(121) != -1 && (bestDateTimePattern.indexOf(77) != -1 || bestDateTimePattern.indexOf(76) != -1)) {
            this.ak.removeAllViews();
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            for (int i = 0; i < bestDateTimePattern.length(); i++) {
                char charAt = bestDateTimePattern.charAt(i);
                if (charAt == 'L' || charAt == 'M') {
                    if (!z2) {
                        this.ak.addView(this.am);
                        z2 = true;
                    }
                } else if (charAt != 'd') {
                    if (charAt == 'y' && !z4) {
                        this.ak.addView(this.al);
                        z4 = true;
                    }
                } else if (!z3) {
                    this.ak.addView(this.an);
                    z3 = true;
                }
            }
        }
        this.af.set(bundle2.getInt("birthday_picker_year"), bundle2.getInt("birthday_picker_month"), bundle2.getInt("birthday_picker_day"));
        aG();
        return new AlertDialog.Builder(C()).setView(inflate).setTitle(bundle2.getCharSequence("birthday_picker_title")).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: wac
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                wae waeVar = wae.this;
                waeVar.ae.aI(waeVar.af.get(1), waeVar.af.get(2), waeVar.af.get(5));
            }
        }).setNegativeButton(R.string.cancel, hgs.h).create();
    }
}
