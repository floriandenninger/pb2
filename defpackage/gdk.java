package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.text.style.ClickableSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.ui.bottomui.HatsContainer;
import com.google.android.apps.youtube.app.common.ui.bottomui.HatsHorizontalSurvey;
import com.google.android.apps.youtube.app.common.ui.bottomui.HatsSurvey;
import com.google.android.apps.youtube.app.common.ui.bottomui.KeyPressAwareEditText;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.FeedbackEndpointOuterClass;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gdk implements gbj {
    public final aahd a;
    final HatsContainer b;
    final YouTubeTextView c;
    final HatsSurvey d;
    final HatsHorizontalSurvey e;
    public final Map f = new HashMap();
    public final ayqd g;
    gat h;
    private final ajut i;

    public gdk(ajut ajutVar, aahd aahdVar, ayqd ayqdVar, HatsContainer hatsContainer) {
        this.i = ajutVar;
        this.a = aahdVar;
        this.b = hatsContainer;
        gbp a = hatsContainer.a();
        if (a.a == null) {
            a.a = (YouTubeTextView) a.a(R.layout.hats_prompt);
        }
        this.c = a.a;
        this.e = hatsContainer.a().b();
        gbp a2 = hatsContainer.a();
        if (a2.b == null) {
            a2.b = (HatsSurvey) a2.a(R.layout.hats_survey);
        }
        this.d = a2.b;
        this.g = ayqdVar;
    }

    private static final boolean e(gcu gcuVar) {
        if (gcuVar.d == 1) {
            avci avciVar = gcuVar.f;
            avciVar.getClass();
            avck avckVar = avciVar.c;
            if (avckVar == null) {
                avckVar = avck.a;
            }
            int aQ = aobq.aQ(avckVar.b);
            if (aQ == 0 || aQ != 3) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.gbj
    public final /* synthetic */ View a(gbi gbiVar, gat gatVar) {
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        final gcu gcuVar = (gcu) gbiVar;
        this.h = gatVar;
        if (gcuVar.d != 3) {
            this.b.d(new View.OnClickListener() { // from class: gdb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    gdk.this.b(gcuVar);
                }
            });
        }
        if (e(gcuVar)) {
            whu.G(this.c, gcuVar.i);
            this.d.d(gcuVar.i);
        } else {
            this.e.d(gcuVar.i);
        }
        int i = gcuVar.d;
        final apmg apmgVar = null;
        if (i == 1) {
            avci avciVar = gcuVar.f;
            avciVar.getClass();
            boolean e = e(gcuVar);
            HatsSurvey hatsSurvey = e ? this.d : this.e;
            YouTubeTextView youTubeTextView = e ? this.c : null;
            hatsSurvey.f(null, null);
            aony<avcj> aonyVar = avciVar.j;
            ViewGroup viewGroup = hatsSurvey.d;
            ArrayList arrayList = new ArrayList(aonyVar.size());
            for (avcj avcjVar : aonyVar) {
                if (avcjVar.b == 84469192) {
                    final avch avchVar = (avch) avcjVar.c;
                    View d = gfw.d(viewGroup.getContext(), viewGroup, e);
                    gfw.g(d, avchVar, this.i, new View.OnClickListener() { // from class: gdd
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            gdk gdkVar = gdk.this;
                            gcu gcuVar2 = gcuVar;
                            avch avchVar2 = avchVar;
                            gbu gbuVar = gcuVar2.m;
                            if (gbuVar != null) {
                                apxf apxfVar = avchVar2.e;
                                if (apxfVar == null) {
                                    apxfVar = apxf.a;
                                }
                                gbuVar.a(apxfVar);
                            }
                            gdkVar.c(1);
                        }
                    });
                    arrayList.add(d);
                }
            }
            hatsSurvey.e(arrayList);
            if (!e) {
                this.e.b(gfw.f(avciVar.j));
                this.e.a(gfw.e(avciVar.j));
            }
            this.b.f(hatsSurvey);
            this.b.e(youTubeTextView);
        } else if (i == 2) {
            avbz avbzVar = gcuVar.g;
            avbzVar.getClass();
            aony<avca> aonyVar2 = avbzVar.g;
            ViewGroup viewGroup2 = this.d.d;
            this.f.clear();
            LayoutInflater from = LayoutInflater.from(viewGroup2.getContext());
            ArrayList arrayList2 = new ArrayList(aonyVar2.size());
            for (avca avcaVar : aonyVar2) {
                if ((avcaVar.b & 1) != 0) {
                    avby avbyVar = avcaVar.c;
                    if (avbyVar == null) {
                        avbyVar = avby.a;
                    }
                    apxf apxfVar = avbyVar.d;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    final gdi gdiVar = new gdi(apxfVar, avbyVar.f);
                    CheckBox checkBox = (CheckBox) from.inflate(R.layout.hats_checkbox_survey_option, viewGroup2, false);
                    if ((avbyVar.b & 1) != 0) {
                        aqygVar = avbyVar.c;
                        if (aqygVar == null) {
                            aqygVar = aqyg.a;
                        }
                    } else {
                        aqygVar = null;
                    }
                    checkBox.setText(ajcq.b(aqygVar));
                    checkBox.setOnClickListener(new View.OnClickListener() { // from class: gde
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            gdk gdkVar = gdk.this;
                            gdi gdiVar2 = gdiVar;
                            for (Map.Entry entry : gdkVar.f.entrySet()) {
                                CheckBox checkBox2 = (CheckBox) entry.getValue();
                                if (!view.equals(checkBox2) && (gdiVar2.b || ((gdi) entry.getKey()).b)) {
                                    checkBox2.setChecked(false);
                                }
                            }
                        }
                    });
                    arrayList2.add(checkBox);
                    this.f.put(gdiVar, checkBox);
                }
            }
            this.d.e(arrayList2);
            apmh apmhVar = avbzVar.i;
            if (apmhVar == null) {
                apmhVar = apmh.a;
            }
            if ((apmhVar.b & 1) != 0) {
                apmh apmhVar2 = avbzVar.i;
                if (apmhVar2 == null) {
                    apmhVar2 = apmh.a;
                }
                apmgVar = apmhVar2.c;
                if (apmgVar == null) {
                    apmgVar = apmg.a;
                }
            }
            this.d.f(apmgVar, new View.OnClickListener() { // from class: gdc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    gdk gdkVar = gdk.this;
                    gcu gcuVar2 = gcuVar;
                    apmg apmgVar2 = apmgVar;
                    gbu gbuVar = gcuVar2.m;
                    if (gbuVar != null) {
                        ArrayList arrayList3 = new ArrayList();
                        for (Map.Entry entry : gdkVar.f.entrySet()) {
                            if (((CheckBox) entry.getValue()).isChecked()) {
                                arrayList3.add(((gdi) entry.getKey()).a);
                            }
                        }
                        if (arrayList3.isEmpty()) {
                            return;
                        }
                        if (!arrayList3.isEmpty()) {
                            apxf apxfVar2 = (apxf) arrayList3.get(0);
                            HashMap hashMap = null;
                            if (apxfVar2.pY(FeedbackEndpointOuterClass.feedbackEndpoint)) {
                                gbuVar.b.m(gbuVar.a, apxfVar2);
                                if (arrayList3.size() > 1) {
                                    hashMap = new HashMap();
                                    hashMap.putAll(gbuVar.b.c);
                                    ArrayList arrayList4 = new ArrayList(arrayList3.size() - 1);
                                    for (int i2 = 1; i2 < arrayList3.size(); i2++) {
                                        arrayList4.add(((aqwl) ((apxf) arrayList3.get(i2)).pX(FeedbackEndpointOuterClass.feedbackEndpoint)).e);
                                    }
                                    hashMap.put("feedback_merge_token", true);
                                    hashMap.put("feedback_token", arrayList4);
                                }
                            }
                            gbuVar.b.a.c(apxfVar2, hashMap);
                        }
                        apmgVar2.getClass();
                        if ((apmgVar2.b & 8192) != 0) {
                            aahd aahdVar = gdkVar.a;
                            apxf apxfVar3 = apmgVar2.n;
                            if (apxfVar3 == null) {
                                apxfVar3 = apxf.a;
                            }
                            aahdVar.c(apxfVar3, acrc.g(gcuVar2));
                        }
                        if ((apmgVar2.b & 16384) != 0) {
                            aahd aahdVar2 = gdkVar.a;
                            apxf apxfVar4 = apmgVar2.o;
                            if (apxfVar4 == null) {
                                apxfVar4 = apxf.a;
                            }
                            aahdVar2.c(apxfVar4, acrc.g(gcuVar2));
                        }
                        gdkVar.c(1);
                    }
                }
            });
            this.b.f(this.d);
            this.b.e(this.c);
        } else if (i == 3) {
            avcb avcbVar = gcuVar.h;
            avcbVar.getClass();
            final ViewGroup viewGroup3 = this.d.d;
            View inflate = LayoutInflater.from(viewGroup3.getContext()).inflate(R.layout.hats_free_text_survey_option, viewGroup3, false);
            TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(R.id.input_layout);
            KeyPressAwareEditText keyPressAwareEditText = (KeyPressAwareEditText) textInputLayout.findViewById(R.id.input);
            if ((2 & avcbVar.b) != 0) {
                aqygVar2 = avcbVar.d;
                if (aqygVar2 == null) {
                    aqygVar2 = aqyg.a;
                }
            } else {
                aqygVar2 = null;
            }
            keyPressAwareEditText.setHint(ajcq.b(aqygVar2));
            keyPressAwareEditText.setOnTouchListener(new View.OnTouchListener() { // from class: gdg
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    gdk.this.g.c(gdj.b(true));
                    view.requestFocus();
                    whu.J(view);
                    return false;
                }
            });
            keyPressAwareEditText.a = new gcx(this);
            keyPressAwareEditText.addTextChangedListener(new gdh(this, textInputLayout));
            final amrz k = amrz.k("ShowSystemInfoDialogCommandResolver.SHOW_SYSTEM_INFO_DIALOG_COMMAND_ORIGIN_SURVEY_KEY", gcuVar.e);
            final YouTubeTextView youTubeTextView2 = (YouTubeTextView) inflate.findViewById(R.id.disclaimer);
            youTubeTextView2.c();
            if ((avcbVar.b & 4) != 0) {
                aqygVar3 = avcbVar.e;
                if (aqygVar3 == null) {
                    aqygVar3 = aqyg.a;
                }
            } else {
                aqygVar3 = null;
            }
            youTubeTextView2.setText(ajcq.c(aqygVar3, new ajck() { // from class: gcy
                @Override // defpackage.ajck
                public final ClickableSpan a(apxf apxfVar2) {
                    gdk gdkVar = gdk.this;
                    return aahi.a(false).a(gdkVar.a, k, apxfVar2);
                }
            }));
            keyPressAwareEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: gdf
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    whu.I(YouTubeTextView.this, false);
                }
            });
            HatsSurvey hatsSurvey2 = this.d;
            hatsSurvey2.d.removeAllViews();
            hatsSurvey2.d.addView(inflate);
            final TextInputLayout textInputLayout2 = (TextInputLayout) inflate.findViewById(R.id.input_layout);
            final EditText editText = (EditText) textInputLayout2.findViewById(R.id.input);
            apmh apmhVar3 = avcbVar.g;
            if (apmhVar3 == null) {
                apmhVar3 = apmh.a;
            }
            if ((apmhVar3.b & 1) != 0) {
                apmh apmhVar4 = avcbVar.g;
                if (apmhVar4 == null) {
                    apmhVar4 = apmh.a;
                }
                apmgVar = apmhVar4.c;
                if (apmgVar == null) {
                    apmgVar = apmg.a;
                }
            }
            apmgVar.getClass();
            final Runnable runnable = new Runnable() { // from class: gcz
                @Override // java.lang.Runnable
                public final void run() {
                    gdk gdkVar = gdk.this;
                    apmg apmgVar2 = apmgVar;
                    EditText editText2 = editText;
                    if ((apmgVar2.b & 32768) != 0) {
                        amrz k2 = amrz.k("SilentSubmitUserFeedbackCommandResolver.DESCRIPTION_KEY", editText2.getText().toString());
                        aahd aahdVar = gdkVar.a;
                        apxf apxfVar2 = apmgVar2.p;
                        if (apxfVar2 == null) {
                            apxfVar2 = apxf.a;
                        }
                        aahdVar.d(amru.r(apxfVar2), k2);
                    }
                    whu.C(editText2);
                    gdkVar.c(1);
                    gdkVar.g.c(gdj.b(false));
                }
            };
            this.d.f(apmgVar, new ilq(runnable, 1));
            this.d.g(false);
            editText.setImeOptions(4);
            editText.setHorizontallyScrolling(false);
            editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: gcw
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                    EditText editText2 = editText;
                    TextInputLayout textInputLayout3 = textInputLayout2;
                    Runnable runnable2 = runnable;
                    if (i2 != 4 || editText2.getText().length() > textInputLayout3.c) {
                        return false;
                    }
                    runnable2.run();
                    return true;
                }
            });
            this.b.d(new View.OnClickListener() { // from class: gda
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final gdk gdkVar = gdk.this;
                    final EditText editText2 = editText;
                    ViewGroup viewGroup4 = viewGroup3;
                    final gcu gcuVar2 = gcuVar;
                    if (editText2.getText().length() > 0) {
                        new AlertDialog.Builder(viewGroup4.getContext()).setMessage(R.string.hats_free_text_dismiss_dialog).setCancelable(false).setPositiveButton(R.string.hats_free_text_confirm_dismiss, new DialogInterface.OnClickListener() { // from class: gcv
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                gdk.this.d(editText2, gcuVar2);
                            }
                        }).setNegativeButton(R.string.hats_free_text_cancel_dismiss, hgs.b).create().show();
                    } else {
                        gdkVar.d(editText2, gcuVar2);
                    }
                }
            });
            this.b.f(this.d);
            this.b.e(this.c);
        } else {
            throw new AssertionError();
        }
        HatsContainer hatsContainer = this.b;
        hatsContainer.g = true;
        hatsContainer.c();
        return this.b;
    }

    public final void b(gcu gcuVar) {
        gbu gbuVar = gcuVar.m;
        if (gbuVar != null) {
            gbuVar.a(gcuVar.k);
        }
        c(0);
        this.g.c(gdj.b(false));
    }

    public final void c(int i) {
        this.f.clear();
        gat gatVar = this.h;
        if (gatVar != null) {
            gatVar.a(i);
            this.h = null;
        }
    }

    public final void d(View view, gcu gcuVar) {
        b(gcuVar);
        if (view != null) {
            whu.C(view);
        }
    }
}
