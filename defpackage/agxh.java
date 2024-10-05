package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agxh implements agyq, ypd {
    private static final int[] f = {R.attr.backgroundSecondaryInverse, R.attr.colorPrimaryAlternate, R.attr.selectableItemBackground, R.attr.textAppearanceBody1, R.attr.textAppearanceButton, R.attr.textAppearanceTitle, R.attr.textAppearanceSubhead};
    protected final Activity a;
    protected final aahd b;
    protected final ajjs c;
    public agxd d;
    protected agxg e;
    private final ajut g;
    private agxa h;

    public agxh(Activity activity, ajut ajutVar, aahd aahdVar, ajjs ajjsVar) {
        this.a = activity;
        ajutVar.getClass();
        this.g = ajutVar;
        aahdVar.getClass();
        this.b = aahdVar;
        ajjsVar.getClass();
        this.c = ajjsVar;
        TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(f);
        for (int i = 0; i < 7; i++) {
            if (obtainStyledAttributes.getResourceId(i, -1) == -1) {
                String valueOf = String.valueOf(activity.getResources().getResourceEntryName(f[i]));
                throw new IllegalStateException(valueOf.length() != 0 ? "Resource attribute required but not provided ".concat(valueOf) : new String("Resource attribute required but not provided "));
            }
        }
        obtainStyledAttributes.recycle();
    }

    @Override // defpackage.agyq
    public final void a(Object obj, acra acraVar, final Pair pair, final agzm agzmVar) {
        aqyg aqygVar;
        aqyg aqygVar2;
        apmg apmgVar;
        apmg apmgVar2;
        aqyg aqygVar3;
        aqyg aqygVar4;
        int i;
        aqyg aqygVar5;
        aqyg aqygVar6;
        apmg apmgVar3;
        apmg apmgVar4;
        if (obj == null) {
            return;
        }
        if (obj instanceof avul) {
            avul avulVar = (avul) obj;
            if (avulVar.k) {
                if (this.e == null) {
                    this.e = new agxg(this.a, b(), this.b, this.c);
                }
                final agxg agxgVar = this.e;
                agxgVar.e = LayoutInflater.from(agxgVar.a).inflate(R.layout.upsell_dialog_with_header_images, (ViewGroup) null);
                agxgVar.f = (ImageView) agxgVar.e.findViewById(R.id.background_image);
                agxgVar.g = (ImageView) agxgVar.e.findViewById(R.id.logo);
                agxgVar.h = new ajkj(agxgVar.d, agxgVar.f);
                agxgVar.i = new ajkj(agxgVar.d, agxgVar.g);
                agxgVar.j = (TextView) agxgVar.e.findViewById(R.id.dialog_title);
                agxgVar.k = (TextView) agxgVar.e.findViewById(R.id.dialog_message);
                agxgVar.m = (TextView) agxgVar.e.findViewById(R.id.action_button);
                agxgVar.n = (TextView) agxgVar.e.findViewById(R.id.dismiss_button);
                agxgVar.l = agxgVar.b.setView(agxgVar.e).create();
                agxgVar.l.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: agxe
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        agxg agxgVar2 = agxg.this;
                        agxgVar2.a(agxgVar2.p);
                    }
                });
                agxgVar.q = acraVar;
                if ((avulVar.b & 2) == 0) {
                    agxgVar.f.setVisibility(8);
                    agxgVar.h.a();
                } else {
                    agxgVar.f.setVisibility(0);
                    ajkj ajkjVar = agxgVar.h;
                    avgg avggVar = avulVar.d;
                    if (avggVar == null) {
                        avggVar = avgg.a;
                    }
                    ajkjVar.k(avggVar);
                }
                if ((avulVar.b & 1) != 0) {
                    avgg avggVar2 = avulVar.c;
                    if (avggVar2 == null) {
                        avggVar2 = avgg.a;
                    }
                    avgf J2 = ahbw.J(avggVar2);
                    if (J2 != null) {
                        int i2 = J2.d;
                        int i3 = J2.e;
                        yny.z(agxgVar.g, yny.x((int) ((i2 / i3) * r6.getLayoutParams().height)), ViewGroup.LayoutParams.class);
                    }
                    agxgVar.g.setVisibility(0);
                    ajkj ajkjVar2 = agxgVar.i;
                    avgg avggVar3 = avulVar.c;
                    if (avggVar3 == null) {
                        avggVar3 = avgg.a;
                    }
                    ajkjVar2.k(avggVar3);
                } else {
                    agxgVar.g.setVisibility(8);
                    agxgVar.i.a();
                }
                TextView textView = agxgVar.j;
                if ((8 & avulVar.b) != 0) {
                    aqygVar5 = avulVar.e;
                    if (aqygVar5 == null) {
                        aqygVar5 = aqyg.a;
                    }
                } else {
                    aqygVar5 = null;
                }
                whu.G(textView, ajcq.b(aqygVar5));
                TextView textView2 = agxgVar.k;
                if ((avulVar.b & 16) != 0) {
                    aqygVar6 = avulVar.f;
                    if (aqygVar6 == null) {
                        aqygVar6 = aqyg.a;
                    }
                } else {
                    aqygVar6 = null;
                }
                whu.G(textView2, ajcq.b(aqygVar6));
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: agxf
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        apmg apmgVar5;
                        agxg agxgVar2 = agxg.this;
                        agzm agzmVar2 = agzmVar;
                        if (view == agxgVar2.m) {
                            if (agzmVar2 != null) {
                                agzmVar2.b();
                            }
                            apmgVar5 = agxgVar2.o;
                        } else if (view == agxgVar2.n) {
                            if (agzmVar2 != null) {
                                agzmVar2.a();
                            }
                            apmgVar5 = agxgVar2.p;
                        } else {
                            apmgVar5 = null;
                        }
                        agxgVar2.a(apmgVar5);
                        agxgVar2.l.dismiss();
                    }
                };
                apmh apmhVar = avulVar.h;
                if (apmhVar == null) {
                    apmhVar = apmh.a;
                }
                if ((apmhVar.b & 1) != 0) {
                    apmh apmhVar2 = avulVar.h;
                    if (apmhVar2 == null) {
                        apmhVar2 = apmh.a;
                    }
                    apmgVar3 = apmhVar2.c;
                    if (apmgVar3 == null) {
                        apmgVar3 = apmg.a;
                    }
                } else {
                    apmgVar3 = null;
                }
                agxgVar.p = apmgVar3;
                apmh apmhVar3 = avulVar.g;
                if (apmhVar3 == null) {
                    apmhVar3 = apmh.a;
                }
                if ((apmhVar3.b & 1) != 0) {
                    apmh apmhVar4 = avulVar.g;
                    if (apmhVar4 == null) {
                        apmhVar4 = apmh.a;
                    }
                    apmgVar4 = apmhVar4.c;
                    if (apmgVar4 == null) {
                        apmgVar4 = apmg.a;
                    }
                } else {
                    apmgVar4 = null;
                }
                agxgVar.o = apmgVar4;
                if (agxgVar.p != null || agxgVar.o != null) {
                    agxgVar.c(agxgVar.o, agxgVar.m, onClickListener);
                    agxgVar.c(agxgVar.p, agxgVar.n, onClickListener);
                } else {
                    whu.G(agxgVar.n, agxgVar.a.getResources().getText(R.string.cancel));
                    whu.I(agxgVar.m, false);
                }
                agxgVar.l.show();
                agxg.b(agxgVar.c, avulVar);
            } else {
                agxg.b(this.b, avulVar);
            }
            if (acraVar != null) {
                acraVar.u(new acqx(avulVar.i), null);
                return;
            }
            return;
        }
        if (obj instanceof aqkv) {
            if (this.d == null) {
                this.d = new agxd(this.a, b());
            }
            final agxd agxdVar = this.d;
            aqkv aqkvVar = (aqkv) obj;
            ajut ajutVar = this.g;
            if (pair != null) {
                DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: agxc
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i4) {
                        agxd agxdVar2 = agxd.this;
                        agzm agzmVar2 = agzmVar;
                        Pair pair2 = pair;
                        if (i4 == -1) {
                            if (agzmVar2 != null) {
                                agzmVar2.b();
                            }
                            ((Runnable) pair2.second).run();
                        } else if (i4 == -2 && agzmVar2 != null) {
                            agzmVar2.a();
                        }
                        agxdVar2.a();
                    }
                };
                agxdVar.b.setButton(-1, (CharSequence) pair.first, onClickListener2);
                agxdVar.b.setButton(-2, agxdVar.a.getResources().getText(R.string.dismiss), onClickListener2);
            } else {
                agxdVar.b.setButton(-2, agxdVar.a.getResources().getText(R.string.dismiss), new DialogInterface.OnClickListener() { // from class: agxb
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i4) {
                        agxd agxdVar2 = agxd.this;
                        agzm agzmVar2 = agzmVar;
                        if (agzmVar2 != null) {
                            agzmVar2.a();
                        }
                        agxdVar2.a();
                    }
                });
            }
            agxdVar.d.setText(aqkvVar.e);
            if ((aqkvVar.b & 1) != 0) {
                arfs arfsVar = aqkvVar.c;
                if (arfsVar == null) {
                    arfsVar = arfs.a;
                }
                arfr b = arfr.b(arfsVar.c);
                if (b == null) {
                    b = arfr.UNKNOWN;
                }
                i = ajutVar.a(b);
            } else {
                i = 0;
            }
            if (!aqkvVar.d.isEmpty() || i != 0) {
                agxdVar.g.setVisibility(0);
                agxdVar.f.setVisibility(0);
                whu.G(agxdVar.c, aqkvVar.d);
                if (i == 0) {
                    agxdVar.e.setVisibility(8);
                } else {
                    agxdVar.e.setImageResource(i);
                    agxdVar.e.setVisibility(0);
                }
            } else {
                agxdVar.g.setVisibility(8);
                agxdVar.f.setVisibility(8);
            }
            agxdVar.b.show();
            Window window = agxdVar.b.getWindow();
            if (window != null) {
                window.setLayout((int) agxdVar.a.getResources().getDimension(R.dimen.upsell_dialog_width), -2);
            }
            if (acraVar != null) {
                acraVar.u(new acqx(aqkvVar.h), null);
                return;
            }
            return;
        }
        if (obj instanceof aqdt) {
            if (this.h == null) {
                this.h = new agxa(this.a, b(), this.b);
            }
            aqdt aqdtVar = (aqdt) obj;
            if (acraVar != null) {
                acraVar.u(new acqx(aqdtVar.n), null);
            }
            final agxa agxaVar = this.h;
            agxaVar.f = acraVar;
            DialogInterface.OnClickListener onClickListener3 = new DialogInterface.OnClickListener() { // from class: agwz
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    apmg apmgVar5;
                    acra acraVar2;
                    agxa agxaVar2 = agxa.this;
                    agzm agzmVar2 = agzmVar;
                    if (i4 == -1) {
                        if (agzmVar2 != null) {
                            agzmVar2.b();
                        }
                        apmgVar5 = agxaVar2.g;
                    } else if (i4 == -2) {
                        if (agzmVar2 != null) {
                            agzmVar2.a();
                        }
                        apmgVar5 = agxaVar2.h;
                    } else {
                        apmgVar5 = null;
                    }
                    if (apmgVar5 != null && agxaVar2.f != null) {
                        if ((apmgVar5.b & 16384) != 0) {
                            apxf apxfVar = apmgVar5.o;
                            if (apxfVar == null) {
                                apxfVar = apxf.a;
                            }
                            if (!apxfVar.pY(atmb.b) && (acraVar2 = agxaVar2.f) != null) {
                                apxfVar = acraVar2.h(apxfVar);
                            }
                            if (apxfVar != null) {
                                agxaVar2.b.c(apxfVar, null);
                            }
                        }
                        if ((apmgVar5.b & 8192) != 0) {
                            aahd aahdVar = agxaVar2.b;
                            apxf apxfVar2 = apmgVar5.n;
                            if (apxfVar2 == null) {
                                apxfVar2 = apxf.a;
                            }
                            aahdVar.c(apxfVar2, acrc.i(apmgVar5, !((apmgVar5.b & 16384) != 0)));
                        }
                    }
                    dialogInterface.dismiss();
                }
            };
            agxaVar.c.setButton(-1, agxaVar.a.getResources().getText(R.string.ok), onClickListener3);
            agxaVar.c.setButton(-2, agxaVar.a.getResources().getText(R.string.cancel), onClickListener3);
            TextView textView3 = agxaVar.d;
            if ((aqdtVar.b & 1) != 0) {
                aqygVar = aqdtVar.c;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            whu.G(textView3, ajcq.b(aqygVar));
            TextView textView4 = agxaVar.e;
            if ((aqdtVar.b & 67108864) != 0) {
                aqygVar2 = aqdtVar.u;
                if (aqygVar2 == null) {
                    aqygVar2 = aqyg.a;
                }
            } else {
                aqygVar2 = null;
            }
            whu.G(textView4, ajcq.b(aqygVar2));
            agxaVar.c.show();
            apmh apmhVar5 = aqdtVar.i;
            if (apmhVar5 == null) {
                apmhVar5 = apmh.a;
            }
            if ((apmhVar5.b & 1) != 0) {
                apmh apmhVar6 = aqdtVar.i;
                if (apmhVar6 == null) {
                    apmhVar6 = apmh.a;
                }
                apmgVar = apmhVar6.c;
                if (apmgVar == null) {
                    apmgVar = apmg.a;
                }
            } else {
                apmgVar = null;
            }
            apmh apmhVar7 = aqdtVar.h;
            if (apmhVar7 == null) {
                apmhVar7 = apmh.a;
            }
            if ((apmhVar7.b & 1) != 0) {
                apmh apmhVar8 = aqdtVar.h;
                if (apmhVar8 == null) {
                    apmhVar8 = apmh.a;
                }
                apmgVar2 = apmhVar8.c;
                if (apmgVar2 == null) {
                    apmgVar2 = apmg.a;
                }
            } else {
                apmgVar2 = null;
            }
            if (apmgVar != null) {
                Button button = agxaVar.c.getButton(-2);
                if ((apmgVar.b & 256) != 0) {
                    aqygVar4 = apmgVar.i;
                    if (aqygVar4 == null) {
                        aqygVar4 = aqyg.a;
                    }
                } else {
                    aqygVar4 = null;
                }
                button.setText(ajcq.b(aqygVar4));
                agxaVar.c.getButton(-2).setTextColor(wbs.Q(agxaVar.a, R.attr.ytCallToAction));
                if (acraVar != null) {
                    acraVar.u(new acqx(apmgVar.t), null);
                }
            } else if (apmgVar2 != null) {
                agxaVar.c.getButton(-2).setVisibility(8);
            }
            if (apmgVar2 != null) {
                Button button2 = agxaVar.c.getButton(-1);
                if ((apmgVar2.b & 256) != 0) {
                    aqygVar3 = apmgVar2.i;
                    if (aqygVar3 == null) {
                        aqygVar3 = aqyg.a;
                    }
                } else {
                    aqygVar3 = null;
                }
                button2.setText(ajcq.b(aqygVar3));
                agxaVar.c.getButton(-1).setTextColor(wbs.Q(agxaVar.a, R.attr.ytCallToAction));
                if (acraVar != null) {
                    acraVar.u(new acqx(apmgVar2.t), null);
                }
            } else {
                agxaVar.c.getButton(-1).setVisibility(8);
            }
            agxaVar.h = apmgVar;
            agxaVar.g = apmgVar2;
        }
    }

    protected final AlertDialog.Builder b() {
        return new AlertDialog.Builder(this.a);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{afto.class};
        }
        if (i == 0) {
            agxg agxgVar = this.e;
            if (agxgVar != null && agxgVar.l.isShowing()) {
                agxgVar.l.cancel();
            }
            agxd agxdVar = this.d;
            if (agxdVar == null) {
                return null;
            }
            agxdVar.a();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
