package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ks {
    public static int a;
    public final AccessibilityNodeInfo b;
    public int c = -1;
    public int d = -1;

    private ks(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.b = accessibilityNodeInfo;
    }

    public static ClickableSpan[] K(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public static final SparseArray L(View view) {
        return (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
    }

    public static ks b() {
        return c(AccessibilityNodeInfo.obtain());
    }

    public static ks c(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new ks(accessibilityNodeInfo);
    }

    public final void A(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.b.setHintText(charSequence);
        } else {
            this.b.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public final void B(View view) {
        this.c = -1;
        this.b.setParent(view);
    }

    public final void C(boolean z) {
        this.b.setScrollable(z);
    }

    public final void D(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public final void E(boolean z) {
        this.b.setVisibleToUser(z);
    }

    public final boolean F() {
        return this.b.isChecked();
    }

    public final boolean G() {
        return this.b.isEnabled();
    }

    public final boolean H() {
        return this.b.isFocusable();
    }

    public final boolean I() {
        return this.b.isPassword();
    }

    public final boolean J() {
        return this.b.isScrollable();
    }

    public final void M() {
        this.b.setSelected(false);
    }

    public final Bundle a() {
        return this.b.getExtras();
    }

    public final CharSequence d() {
        return this.b.getClassName();
    }

    public final CharSequence e() {
        return this.b.getContentDescription();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ks)) {
            return false;
        }
        ks ksVar = (ks) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.b;
        if (accessibilityNodeInfo == null) {
            if (ksVar.b != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(ksVar.b)) {
            return false;
        }
        return this.d == ksVar.d && this.c == ksVar.c;
    }

    public final CharSequence f() {
        if (g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty()) {
            return this.b.getText();
        }
        List g = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List g2 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List g3 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List g4 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.b.getText(), 0, this.b.getText().length()));
        for (int i = 0; i < g.size(); i++) {
            spannableString.setSpan(new kp(((Integer) g4.get(i)).intValue(), this, a().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) g.get(i)).intValue(), ((Integer) g2.get(i)).intValue(), ((Integer) g3.get(i)).intValue());
        }
        return spannableString;
    }

    public final List g(String str) {
        ArrayList<Integer> integerArrayList = this.b.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.b.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public final void h(int i) {
        this.b.addAction(i);
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.b;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final void i(kr krVar) {
        this.b.addAction((AccessibilityNodeInfo.AccessibilityAction) krVar.j);
    }

    @Deprecated
    public final void j(Rect rect) {
        this.b.getBoundsInParent(rect);
    }

    public final void k(Rect rect) {
        this.b.getBoundsInScreen(rect);
    }

    public final void l(boolean z) {
        this.b.setAccessibilityFocused(z);
    }

    public final void m(int i, boolean z) {
        Bundle a2 = a();
        if (a2 != null) {
            int i2 = a2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (i ^ (-1));
            if (true != z) {
                i = 0;
            }
            a2.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    @Deprecated
    public final void n(Rect rect) {
        this.b.setBoundsInParent(rect);
    }

    public final void o(Rect rect) {
        this.b.setBoundsInScreen(rect);
    }

    public final void p(boolean z) {
        this.b.setCheckable(z);
    }

    public final void q(boolean z) {
        this.b.setChecked(z);
    }

    public final void r(CharSequence charSequence) {
        this.b.setClassName(charSequence);
    }

    public final void s(boolean z) {
        this.b.setClickable(z);
    }

    public final void t(Object obj) {
        this.b.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) ((kw) obj).a);
    }

    public final String toString() {
        List emptyList;
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        j(rect);
        sb.append("; boundsInParent: " + rect);
        k(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(this.b.getPackageName());
        sb.append("; className: ");
        sb.append(d());
        sb.append("; text: ");
        sb.append(f());
        sb.append("; contentDescription: ");
        sb.append(e());
        sb.append("; viewId: ");
        sb.append(this.b.getViewIdResourceName());
        sb.append("; checkable: ");
        sb.append(this.b.isCheckable());
        sb.append("; checked: ");
        sb.append(F());
        sb.append("; focusable: ");
        sb.append(H());
        sb.append("; focused: ");
        sb.append(this.b.isFocused());
        sb.append("; selected: ");
        sb.append(this.b.isSelected());
        sb.append("; clickable: ");
        sb.append(this.b.isClickable());
        sb.append("; longClickable: ");
        sb.append(this.b.isLongClickable());
        sb.append("; enabled: ");
        sb.append(G());
        sb.append("; password: ");
        sb.append(I());
        sb.append("; scrollable: " + J());
        sb.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.b.getActionList();
        if (actionList != null) {
            emptyList = new ArrayList();
            int size = actionList.size();
            for (int i = 0; i < size; i++) {
                emptyList.add(new kr(actionList.get(i), 0, null, null, null));
            }
        } else {
            emptyList = Collections.emptyList();
        }
        for (int i2 = 0; i2 < emptyList.size(); i2++) {
            kr krVar = (kr) emptyList.get(i2);
            int a2 = krVar.a();
            if (a2 == 1) {
                str = "ACTION_FOCUS";
            } else if (a2 != 2) {
                switch (a2) {
                    case 4:
                        str = "ACTION_SELECT";
                        break;
                    case 8:
                        str = "ACTION_CLEAR_SELECTION";
                        break;
                    case 16:
                        str = "ACTION_CLICK";
                        break;
                    case 32:
                        str = "ACTION_LONG_CLICK";
                        break;
                    case 64:
                        str = "ACTION_ACCESSIBILITY_FOCUS";
                        break;
                    case 128:
                        str = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                        break;
                    case 256:
                        str = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                        break;
                    case 512:
                        str = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                        break;
                    case 1024:
                        str = "ACTION_NEXT_HTML_ELEMENT";
                        break;
                    case 2048:
                        str = "ACTION_PREVIOUS_HTML_ELEMENT";
                        break;
                    case 4096:
                        str = "ACTION_SCROLL_FORWARD";
                        break;
                    case 8192:
                        str = "ACTION_SCROLL_BACKWARD";
                        break;
                    case 16384:
                        str = "ACTION_COPY";
                        break;
                    case 32768:
                        str = "ACTION_PASTE";
                        break;
                    case 65536:
                        str = "ACTION_CUT";
                        break;
                    case 131072:
                        str = "ACTION_SET_SELECTION";
                        break;
                    case 262144:
                        str = "ACTION_EXPAND";
                        break;
                    case 524288:
                        str = "ACTION_COLLAPSE";
                        break;
                    case 2097152:
                        str = "ACTION_SET_TEXT";
                        break;
                    case android.R.id.accessibilityActionMoveWindow:
                        str = "ACTION_MOVE_WINDOW";
                        break;
                    case android.R.id.accessibilityActionImeEnter:
                        str = "ACTION_IME_ENTER";
                        break;
                    default:
                        switch (a2) {
                            case android.R.id.accessibilityActionShowOnScreen:
                                str = "ACTION_SHOW_ON_SCREEN";
                                break;
                            case android.R.id.accessibilityActionScrollToPosition:
                                str = "ACTION_SCROLL_TO_POSITION";
                                break;
                            case android.R.id.accessibilityActionScrollUp:
                                str = "ACTION_SCROLL_UP";
                                break;
                            case android.R.id.accessibilityActionScrollLeft:
                                str = "ACTION_SCROLL_LEFT";
                                break;
                            case android.R.id.accessibilityActionScrollDown:
                                str = "ACTION_SCROLL_DOWN";
                                break;
                            case android.R.id.accessibilityActionScrollRight:
                                str = "ACTION_SCROLL_RIGHT";
                                break;
                            case android.R.id.accessibilityActionContextClick:
                                str = "ACTION_CONTEXT_CLICK";
                                break;
                            case android.R.id.accessibilityActionSetProgress:
                                str = "ACTION_SET_PROGRESS";
                                break;
                            default:
                                switch (a2) {
                                    case android.R.id.accessibilityActionShowTooltip:
                                        str = "ACTION_SHOW_TOOLTIP";
                                        break;
                                    case android.R.id.accessibilityActionHideTooltip:
                                        str = "ACTION_HIDE_TOOLTIP";
                                        break;
                                    case android.R.id.accessibilityActionPageUp:
                                        str = "ACTION_PAGE_UP";
                                        break;
                                    case android.R.id.accessibilityActionPageDown:
                                        str = "ACTION_PAGE_DOWN";
                                        break;
                                    case android.R.id.accessibilityActionPageLeft:
                                        str = "ACTION_PAGE_LEFT";
                                        break;
                                    case android.R.id.accessibilityActionPageRight:
                                        str = "ACTION_PAGE_RIGHT";
                                        break;
                                    case android.R.id.accessibilityActionPressAndHold:
                                        str = "ACTION_PRESS_AND_HOLD";
                                        break;
                                    default:
                                        str = "ACTION_UNKNOWN";
                                        break;
                                }
                        }
                }
            } else {
                str = "ACTION_CLEAR_FOCUS";
            }
            if (str.equals("ACTION_UNKNOWN") && krVar.b() != null) {
                str = krVar.b().toString();
            }
            sb.append(str);
            if (i2 != emptyList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final void u(Object obj) {
        this.b.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) ((kw) obj).a);
    }

    public final void v(CharSequence charSequence) {
        this.b.setContentDescription(charSequence);
    }

    public final void w(boolean z) {
        this.b.setDismissable(z);
    }

    public final void x(boolean z) {
        this.b.setEnabled(z);
    }

    public final void y(boolean z) {
        this.b.setFocusable(z);
    }

    public final void z(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.b.setHeading(z);
        } else {
            m(2, z);
        }
    }
}
