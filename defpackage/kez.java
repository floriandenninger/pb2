package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kez {
    public final Activity a;
    public final aahd b;
    public AlertDialog c;
    public View d;
    public final azrw e;
    private RadioGroup f;

    public kez(Activity activity, aahd aahdVar, azrw azrwVar) {
        this.a = activity;
        this.b = aahdVar;
        this.e = azrwVar;
    }

    public final void a(atsx atsxVar) {
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        aqyg aqygVar4;
        if (this.c == null) {
            View inflate = LayoutInflater.from(this.a).inflate(R.layout.options_dialog, (ViewGroup) null, false);
            this.d = inflate;
            ((TextView) inflate.findViewById(R.id.content_owner_rights)).setMovementMethod(LinkMovementMethod.getInstance());
            View view = this.d;
            view.getClass();
            this.f = (RadioGroup) view.findViewById(R.id.option_items_list);
            for (atss atssVar : atsxVar.c) {
                RadioButton radioButton = new RadioButton(this.a);
                int i = atssVar.b;
                if ((i & 8) != 0) {
                    atsx atsxVar2 = atssVar.f;
                    if (atsxVar2 == null) {
                        atsxVar2 = atsx.a;
                    }
                    radioButton.setTag(atsxVar2);
                    atsx atsxVar3 = atssVar.f;
                    if (atsxVar3 == null) {
                        atsxVar3 = atsx.a;
                    }
                    if ((1 & atsxVar3.b) != 0) {
                        atsx atsxVar4 = atssVar.f;
                        if (atsxVar4 == null) {
                            atsxVar4 = atsx.a;
                        }
                        aqygVar2 = atsxVar4.d;
                        if (aqygVar2 == null) {
                            aqygVar2 = aqyg.a;
                        }
                    } else {
                        aqygVar2 = null;
                    }
                    radioButton.setText(ajcq.b(aqygVar2));
                } else if ((i & 2) != 0) {
                    atsv atsvVar = atssVar.d;
                    if (atsvVar == null) {
                        atsvVar = atsv.a;
                    }
                    radioButton.setTag(atsvVar);
                    atsv atsvVar2 = atssVar.d;
                    if (atsvVar2 == null) {
                        atsvVar2 = atsv.a;
                    }
                    if ((1 & atsvVar2.b) != 0) {
                        atsv atsvVar3 = atssVar.d;
                        if (atsvVar3 == null) {
                            atsvVar3 = atsv.a;
                        }
                        aqygVar3 = atsvVar3.c;
                        if (aqygVar3 == null) {
                            aqygVar3 = aqyg.a;
                        }
                    } else {
                        aqygVar3 = null;
                    }
                    radioButton.setText(ajcq.b(aqygVar3));
                } else if ((i & 1) != 0) {
                    atst atstVar = atssVar.c;
                    if (atstVar == null) {
                        atstVar = atst.a;
                    }
                    radioButton.setTag(atstVar);
                    atst atstVar2 = atssVar.c;
                    if (atstVar2 == null) {
                        atstVar2 = atst.a;
                    }
                    if ((1 & atstVar2.b) != 0) {
                        atst atstVar3 = atssVar.c;
                        if (atstVar3 == null) {
                            atstVar3 = atst.a;
                        }
                        aqygVar4 = atstVar3.c;
                        if (aqygVar4 == null) {
                            aqygVar4 = aqyg.a;
                        }
                    } else {
                        aqygVar4 = null;
                    }
                    radioButton.setText(ajcq.b(aqygVar4));
                }
                radioButton.setTextColor(this.a.getResources().getColor(R.color.yt_black_pure));
                ansv ansvVar = (ansv) this.e.get();
                ansvVar.c(radioButton, R.dimen.report_video_option_text_padding, R.dimen.report_video_option_padding);
                ansvVar.b(radioButton);
                if (ansvVar.a) {
                    radioButton.setTextColor(wbs.Q(radioButton.getContext(), R.attr.ytTextPrimary));
                }
                RadioGroup radioGroup = this.f;
                if (radioGroup != null) {
                    radioGroup.addView(radioButton);
                }
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this.a);
            if ((atsxVar.b & 1) != 0) {
                aqygVar = atsxVar.d;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            AlertDialog.Builder title = builder.setTitle(ajcq.b(aqygVar));
            View view2 = this.d;
            view2.getClass();
            AlertDialog create = title.setView(view2).setPositiveButton(R.string.report_button, (DialogInterface.OnClickListener) null).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).create();
            RadioGroup radioGroup2 = this.f;
            if (radioGroup2 != null) {
                radioGroup2.setOnCheckedChangeListener(new lyc(create, 1, (byte[]) null));
            }
            this.c = create;
        }
        this.c.show();
        RadioGroup radioGroup3 = this.f;
        if (radioGroup3 != null) {
            radioGroup3.clearCheck();
        }
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: key
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int checkedRadioButtonId;
                kez kezVar = kez.this;
                View view4 = kezVar.d;
                RadioGroup radioGroup4 = view4 != null ? (RadioGroup) view4.findViewById(R.id.option_items_list) : null;
                if (radioGroup4 == null || (checkedRadioButtonId = radioGroup4.getCheckedRadioButtonId()) == -1) {
                    return;
                }
                Object tag = radioGroup4.findViewById(checkedRadioButtonId).getTag();
                if (tag instanceof atsx) {
                    new kez(kezVar.a, kezVar.b, kezVar.e).a((atsx) tag);
                } else if (tag instanceof atsv) {
                    aahd aahdVar = kezVar.b;
                    apxf apxfVar = ((atsv) tag).d;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    aahdVar.c(apxfVar, null);
                } else if (tag instanceof atst) {
                    aahd aahdVar2 = kezVar.b;
                    apxf apxfVar2 = ((atst) tag).d;
                    if (apxfVar2 == null) {
                        apxfVar2 = apxf.a;
                    }
                    aahdVar2.c(apxfVar2, null);
                }
                AlertDialog alertDialog = kezVar.c;
                alertDialog.getClass();
                alertDialog.dismiss();
            }
        };
        AlertDialog alertDialog = this.c;
        alertDialog.getClass();
        alertDialog.getButton(-1).setOnClickListener(onClickListener);
    }
}
