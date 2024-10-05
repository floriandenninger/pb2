package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abkt extends abkd implements DialogInterface.OnShowListener, abjq, zar {
    public acra ae;
    public ajvb af;
    public ajvb ag;
    public abjr ah;
    public abiy ai;
    Object aj;
    public Integer ak;
    public Integer al;
    private View am;
    private ajom an;
    private ajvb ao;
    private apxf ap;
    private zas aq;
    private boolean ar;

    @Override // defpackage.abjq
    public final void d() {
        Window window;
        Dialog dialog = this.d;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        Context context = window.getContext();
        int L = yjk.L(context) - ((int) (yjk.N(context) / context.getResources().getFraction(R.fraction.live_chat_aspect_ratio_16_9, 1, 1)));
        if (this.ah.c || context.getResources().getConfiguration().orientation == 2 || this.ak != null) {
            L = -1;
        }
        window.setLayout(-1, L);
        window.setGravity(this.ah.b);
    }

    @Override // defpackage.zar
    public final void lI(boolean z, int i) {
        Dialog dialog;
        if (z != this.ar && (dialog = this.d) != null) {
            dialog.dismiss();
        }
        this.ar = z;
    }

    @Override // defpackage.zar
    public final void lJ(boolean z, int i) {
        this.ar = z;
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mD() {
        super.mD();
        this.ah.b(this);
        zas zasVar = this.aq;
        if (zasVar != null) {
            zasVar.disable();
        }
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        Object a;
        super.mR(bundle);
        o(2, R.style.show_live_chat_item_dialog);
        Bundle bundle2 = this.m;
        ajvb ajvbVar = this.ah.c ? this.ag : this.af;
        this.ao = ajvbVar;
        ajvbVar.a(asra.class);
        if (bundle2 != null) {
            byte[] byteArray = bundle2.getByteArray("applied_action");
            if (byteArray != null) {
                try {
                    this.ap = (apxf) aonm.parseFrom(apxf.a, byteArray, aomw.b());
                } catch (aoob unused) {
                }
            }
            byte[] byteArray2 = bundle2.getByteArray("endpoint");
            if (byteArray2 != null) {
                try {
                    ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint showLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint = (ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint) aonm.parseFrom(ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint.a, byteArray2, aomw.b());
                    if (showLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint != null && (showLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint.b & 1) != 0) {
                        aspl asplVar = showLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint.c;
                        if (asplVar == null) {
                            asplVar = aspl.a;
                        }
                        int i = asplVar.b;
                        if (i == 117300536) {
                            a = (asps) asplVar.c;
                        } else if (i == 129492606) {
                            a = (aspo) asplVar.c;
                        } else if (i == 130661514) {
                            a = (aspm) asplVar.c;
                        } else if (i == 132496275) {
                            a = (asqj) asplVar.c;
                        } else if (i == 133279312) {
                            a = (aspp) asplVar.c;
                        } else if (i == 146948953) {
                            a = (aspr) asplVar.c;
                        } else if (i == 146966970) {
                            a = (aspj) asplVar.c;
                        } else if (i == 165252689) {
                            a = (aspt) asplVar.c;
                        } else if (i == 232396290) {
                            a = (aspn) asplVar.c;
                        } else if (i == 197064214) {
                            a = (asqk) asplVar.c;
                        } else {
                            a = i == 153515154 ? ajds.a((aqrf) asplVar.c) : null;
                        }
                        this.aj = a;
                        if (a != null) {
                            return;
                        }
                    }
                } catch (aoob unused2) {
                }
            }
        }
        dismiss();
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mS() {
        super.mS();
        d();
        this.ah.a(this);
        if (this.ah.c) {
            Window window = this.d.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.dimAmount = 0.0f;
            attributes.flags |= 2;
            window.setAttributes(attributes);
        }
        if (C() == null || C().getWindowManager() == null || !yjk.aa(qR()) || this.ah.c) {
            return;
        }
        zas zasVar = new zas(C(), C().getWindowManager());
        this.aq = zasVar;
        zasVar.a(this);
        this.aq.enable();
    }

    /* JADX WARN: Type inference failed for: r8v4, types: [ajos, java.lang.Object] */
    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setOnClickListener(new abks(this));
        ajom r = ahbw.r(this.ao.get(), this.aj, frameLayout);
        this.an = r;
        if (r != null) {
            Resources resources = context.getResources();
            View a = this.an.a();
            this.am = a;
            int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.live_chat_show_ticker_item_dialog_margin);
            int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.live_chat_header_height);
            int dimensionPixelOffset3 = resources.getDimensionPixelOffset(R.dimen.live_chat_ticker_item_radius);
            int i = dimensionPixelOffset3 + dimensionPixelOffset3;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            if (this.ah.c && (this.aj instanceof asqk) && !this.ai.a()) {
                layoutParams.width = (int) qX().getDimension(R.dimen.live_chat_overlay_sponsor_item_max_width);
            }
            Integer num = this.ak;
            if (num != null) {
                layoutParams.topMargin = num.intValue();
            } else if (!this.ah.c) {
                layoutParams.topMargin = dimensionPixelOffset2 + dimensionPixelOffset + i;
            }
            Integer num2 = this.al;
            if (num2 != null) {
                layoutParams.setMarginStart(num2.intValue());
            } else {
                layoutParams.setMarginStart(dimensionPixelOffset);
            }
            layoutParams.bottomMargin = dimensionPixelOffset;
            layoutParams.setMarginEnd(dimensionPixelOffset);
            frameLayout.addView(a, layoutParams);
            ajok ajokVar = new ajok();
            ajokVar.f("live_chat_item_action", this.ap);
            ajokVar.a(this.ae);
            this.an.oB(ajokVar, this.aj);
        }
        return frameLayout;
    }

    @Override // defpackage.ce, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if ((yjk.aa(qR()) || configuration.orientation != 2) && !this.ah.c) {
            return;
        }
        dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [ajos, java.lang.Object] */
    @Override // defpackage.bv, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        ajom ajomVar = this.an;
        if (ajomVar != 0) {
            ajomVar.b(this.ao.get());
        }
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        int intValue;
        int intValue2;
        View view = this.am;
        if (view != null) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.am.getLayoutParams();
            Integer num = this.ak;
            if (num != null && (intValue2 = num.intValue() - i2) != 0) {
                marginLayoutParams.topMargin += intValue2;
                this.O.requestLayout();
            }
            Integer num2 = this.al;
            if (num2 == null || (intValue = num2.intValue() - i) == 0) {
                return;
            }
            marginLayoutParams.setMarginStart(marginLayoutParams.getMarginStart() + intValue);
            this.O.requestLayout();
        }
    }

    @Override // defpackage.bv
    public final Dialog oq(Bundle bundle) {
        Dialog oq = super.oq(bundle);
        oq.setOnShowListener(this);
        return oq;
    }
}
