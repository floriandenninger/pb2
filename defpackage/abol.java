package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.provider.Settings;
import android.support.v7.widget.AppCompatImageView;
import android.text.SpannableStringBuilder;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class abol extends abns {
    private EditText A;
    private TextView B;
    private ImageView C;
    private ViewGroup D;
    private View E;
    private final axze F;
    public final View w;
    final ValueAnimator x;
    private final ajjz y;
    private final zim z;

    public abol(Context context, ajjz ajjzVar, ajut ajutVar, aahd aahdVar, abjr abjrVar, abji abjiVar, ajsa ajsaVar, acpk acpkVar, zim zimVar, aoae aoaeVar, akcy akcyVar, axze axzeVar, advq advqVar, View view, boolean z, boolean z2, acra acraVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        super(context, zimVar, ajutVar, aahdVar, acraVar, abjrVar, abjiVar, ajsaVar, acpkVar, aoaeVar, akcyVar, advqVar, z, z2, null, null, null, null);
        this.y = ajjzVar;
        this.w = view;
        this.z = zimVar;
        this.F = axzeVar;
        this.x = ValueAnimator.ofInt(0, 20).setDuration(4000L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.abns
    public final void A(int i) {
        int orElse;
        TextView v = v();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.a, this.z.a);
        if (v == null) {
            return;
        }
        if (r().getLineCount() > 1) {
            if (i > 0) {
                orElse = wbs.W(contextThemeWrapper, R.attr.liveChatActionPanelChipBackground).orElse(0);
            } else {
                orElse = wbs.W(contextThemeWrapper, R.attr.liveChatActionPanelChipBackgroundOverlimit).orElse(0);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Integer.toString(i));
            spannableStringBuilder.setSpan(new abjx(contextThemeWrapper, wbs.W(contextThemeWrapper, R.attr.ytStaticBrandWhite).orElse(0), orElse, null), 0, spannableStringBuilder.length(), 33);
            v.setText(spannableStringBuilder.append((CharSequence) " "));
            v.setVisibility(0);
            return;
        }
        v.setVisibility(8);
    }

    @Override // defpackage.abns
    public final void F(avgg avggVar) {
        this.y.h(s(), avggVar);
    }

    @Override // defpackage.abns
    public final void G(boolean z) {
        t().setContentDescription(this.a.getResources().getString(z ? R.string.close_emoji_picker_button_cd : R.string.open_emoji_picker_button_cd));
        t().setColorFilter(g(arfr.EMOJI, z));
    }

    @Override // defpackage.abjn
    public final void b() {
        ViewGroup q;
        int i = Settings.Global.getInt(this.a.getContentResolver(), "transition_animation_scale", 1);
        if (J() || !this.h || i == 0 || (q = q()) == null) {
            return;
        }
        View view = null;
        int i2 = 0;
        for (int i3 = 0; i3 < q.getChildCount(); i3++) {
            View childAt = q.getChildAt(i3);
            if ("product-picker".equals(childAt.getTag(R.id.live_chat_picker_toggle_button_tag))) {
                i2++;
                view = childAt;
            }
        }
        if (i2 == 1 && view != null && (view instanceof ImageView)) {
            ImageView imageView = (ImageView) view;
            if (this.x.isRunning()) {
                this.x.end();
            }
            this.x.removeAllUpdateListeners();
            this.x.removeAllListeners();
            this.x.addUpdateListener(new abok(this, imageView));
            this.x.addListener(new aboj(imageView));
            this.x.start();
        }
    }

    @Override // defpackage.abns
    public final int g(arfr arfrVar, boolean z) {
        arfr arfrVar2 = arfr.SUPER_CHAT_FOR_GOOD;
        int i = R.attr.ytIconInactive;
        if (arfrVar != arfrVar2) {
            if (z) {
                i = R.attr.liveChatEmojiPickerActiveIconColor;
            } else if (true == J()) {
                i = R.attr.ytStaticWhite;
            }
        }
        return wbs.W(new ContextThemeWrapper(this.a, this.z.a), i).orElse(0);
    }

    @Override // defpackage.abns
    public final View k(arfs arfsVar) {
        attq attqVar;
        int i;
        ajut ajutVar = this.d;
        arfr b = arfr.b(arfsVar.c);
        if (b == null) {
            b = arfr.UNKNOWN;
        }
        int a = ajutVar.a(b);
        if (J()) {
            i = R.layout.live_chat_overlay_action_button_menu_toggle;
        } else {
            arfd a2 = this.F.a.a();
            if (a2 != null) {
                attqVar = a2.w;
                if (attqVar == null) {
                    attqVar = attq.a;
                }
            } else {
                attqVar = attq.a;
            }
            i = attqVar.c ? R.layout.live_chat_action_button_menu_toggle : R.layout.live_chat_action_button_menu_toggle_legacy;
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) LayoutInflater.from(this.a).inflate(i, q(), false);
        if (a != 0) {
            appCompatImageView.setImageResource(a);
            arfr b2 = arfr.b(arfsVar.c);
            if (b2 == null) {
                b2 = arfr.UNKNOWN;
            }
            appCompatImageView.setColorFilter(g(b2, false));
        }
        return appCompatImageView;
    }

    @Override // defpackage.abns
    public final View l() {
        return this.w.findViewById(R.id.live_chat_action_panel);
    }

    @Override // defpackage.abns
    public final View m() {
        return this.w.findViewById(R.id.live_chat_text_field_bar);
    }

    @Override // defpackage.abns
    public final View n() {
        return this.w;
    }

    @Override // defpackage.abns
    public final View o() {
        if (this.E == null) {
            this.E = this.w.findViewById(R.id.thumbnail_and_emoji_picker_container);
        }
        return this.E;
    }

    @Override // defpackage.abns
    public final ViewGroup p() {
        return (ViewGroup) this.w.findViewById(R.id.live_chat_button_menu);
    }

    @Override // defpackage.abns
    public final ViewGroup q() {
        if (this.D == null) {
            this.D = (ViewGroup) this.w.findViewById(R.id.inline_extra_buttons);
        }
        return this.D;
    }

    @Override // defpackage.abns
    public final EditText r() {
        if (this.A == null) {
            EditText editText = (EditText) this.w.findViewById(R.id.edit_text);
            this.A = editText;
            editText.setFocusable(true);
            this.A.setFocusableInTouchMode(true);
            this.A.setLongClickable(true);
        }
        return this.A;
    }

    @Override // defpackage.abns
    public final ImageView u() {
        if (this.C == null) {
            this.C = (ImageView) this.w.findViewById(R.id.live_chat_send_button);
        }
        return this.C;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.abns
    public final TextView v() {
        return (TextView) this.w.findViewById(R.id.character_counter);
    }

    @Override // defpackage.abns
    public final TextView w() {
        if (this.B == null) {
            this.B = (TextView) this.w.findViewById(R.id.restricted_participation_bar);
        }
        return this.B;
    }

    @Override // defpackage.abns
    public final void x() {
        this.A.getText().clear();
        whu.C(this.A);
    }
}
