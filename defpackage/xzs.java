package defpackage;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.format.DateFormat;
import android.widget.DatePicker;
import android.widget.TimePicker;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class xzs implements ayqa {
    public final /* synthetic */ Context a;
    public final /* synthetic */ bajg b;
    private final /* synthetic */ int c;

    public /* synthetic */ xzs(Context context, bajg bajgVar, int i) {
        this.c = i;
        this.a = context;
        this.b = bajgVar;
    }

    public /* synthetic */ xzs(bajg bajgVar, Context context, int i) {
        this.c = i;
        this.b = bajgVar;
        this.a = context;
    }

    @Override // defpackage.ayqa
    public final void a(final aypz aypzVar) {
        int i = this.c;
        final int i2 = 0;
        final int i3 = 1;
        if (i == 0) {
            Context context = this.a;
            final bajg bajgVar = this.b;
            TimePickerDialog timePickerDialog = new TimePickerDialog(context, new TimePickerDialog.OnTimeSetListener() { // from class: afnc
                @Override // android.app.TimePickerDialog.OnTimeSetListener
                public final void onTimeSet(TimePicker timePicker, int i4, int i5) {
                    if (i3 == 0) {
                        bajg bajgVar2 = bajgVar;
                        aypz aypzVar2 = aypzVar;
                        if (timePicker.isShown()) {
                            aypzVar2.d(bajgVar2.d(i4).f(i5));
                            aypzVar2.a();
                            return;
                        }
                        return;
                    }
                    bajg bajgVar3 = bajgVar;
                    aypz aypzVar3 = aypzVar;
                    aypzVar3.d(bajgVar3.d(i4).f(i5));
                    aypzVar3.a();
                }
            }, bajgVar.m(), bajgVar.n(), DateFormat.is24HourFormat(context));
            timePickerDialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: xzr
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    int i4 = i2;
                    if (i4 == 0) {
                        aypzVar.a();
                        return;
                    }
                    if (i4 == 1) {
                        aypzVar.a();
                    } else if (i4 != 2) {
                        aypzVar.a();
                    } else {
                        aypzVar.a();
                    }
                }
            });
            timePickerDialog.show();
            return;
        }
        if (i == 1) {
            final bajg bajgVar2 = this.b;
            DatePickerDialog datePickerDialog = new DatePickerDialog(this.a, new DatePickerDialog.OnDateSetListener() { // from class: aflw
                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(DatePicker datePicker, int i4, int i5, int i6) {
                    if (i3 == 0) {
                        bajg bajgVar3 = bajgVar2;
                        aypz aypzVar2 = aypzVar;
                        if (datePicker.isShown()) {
                            aypzVar2.d(bajgVar3.h(i4).g(i5 + 1).c(i6));
                            aypzVar2.a();
                            return;
                        }
                        return;
                    }
                    bajg bajgVar4 = bajgVar2;
                    aypz aypzVar3 = aypzVar;
                    aypzVar3.d(bajgVar4.h(i4).g(i5 + 1).c(i6));
                    aypzVar3.a();
                }
            }, bajgVar2.p(), bajgVar2.o() - 1, bajgVar2.l());
            datePickerDialog.getDatePicker().setMinDate(System.currentTimeMillis() - 1000);
            datePickerDialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: xzr
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    int i4 = i3;
                    if (i4 == 0) {
                        aypzVar.a();
                        return;
                    }
                    if (i4 == 1) {
                        aypzVar.a();
                    } else if (i4 != 2) {
                        aypzVar.a();
                    } else {
                        aypzVar.a();
                    }
                }
            });
            datePickerDialog.show();
            return;
        }
        final int i4 = 2;
        if (i == 2) {
            final bajg bajgVar3 = this.b;
            DatePickerDialog datePickerDialog2 = new DatePickerDialog(this.a, new DatePickerDialog.OnDateSetListener() { // from class: aflw
                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(DatePicker datePicker, int i42, int i5, int i6) {
                    if (i2 == 0) {
                        bajg bajgVar32 = bajgVar3;
                        aypz aypzVar2 = aypzVar;
                        if (datePicker.isShown()) {
                            aypzVar2.d(bajgVar32.h(i42).g(i5 + 1).c(i6));
                            aypzVar2.a();
                            return;
                        }
                        return;
                    }
                    bajg bajgVar4 = bajgVar3;
                    aypz aypzVar3 = aypzVar;
                    aypzVar3.d(bajgVar4.h(i42).g(i5 + 1).c(i6));
                    aypzVar3.a();
                }
            }, bajgVar3.p(), bajgVar3.o() - 1, bajgVar3.l());
            datePickerDialog2.getDatePicker().setMinDate(System.currentTimeMillis() - 1000);
            datePickerDialog2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: xzr
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    int i42 = i4;
                    if (i42 == 0) {
                        aypzVar.a();
                        return;
                    }
                    if (i42 == 1) {
                        aypzVar.a();
                    } else if (i42 != 2) {
                        aypzVar.a();
                    } else {
                        aypzVar.a();
                    }
                }
            });
            datePickerDialog2.show();
            return;
        }
        Context context2 = this.a;
        final bajg bajgVar4 = this.b;
        TimePickerDialog timePickerDialog2 = new TimePickerDialog(context2, new TimePickerDialog.OnTimeSetListener() { // from class: afnc
            @Override // android.app.TimePickerDialog.OnTimeSetListener
            public final void onTimeSet(TimePicker timePicker, int i42, int i5) {
                if (i2 == 0) {
                    bajg bajgVar22 = bajgVar4;
                    aypz aypzVar2 = aypzVar;
                    if (timePicker.isShown()) {
                        aypzVar2.d(bajgVar22.d(i42).f(i5));
                        aypzVar2.a();
                        return;
                    }
                    return;
                }
                bajg bajgVar32 = bajgVar4;
                aypz aypzVar3 = aypzVar;
                aypzVar3.d(bajgVar32.d(i42).f(i5));
                aypzVar3.a();
            }
        }, bajgVar4.m(), bajgVar4.n(), DateFormat.is24HourFormat(context2));
        final int i5 = 3;
        timePickerDialog2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: xzr
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                int i42 = i5;
                if (i42 == 0) {
                    aypzVar.a();
                    return;
                }
                if (i42 == 1) {
                    aypzVar.a();
                } else if (i42 != 2) {
                    aypzVar.a();
                } else {
                    aypzVar.a();
                }
            }
        });
        timePickerDialog2.show();
    }
}
