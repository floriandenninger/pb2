package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import com.google.android.libraries.youtube.mdx.smartremote.DpadView;
import com.google.android.youtube.R;
import java.util.List;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adpn extends akk {
    final /* synthetic */ DpadView f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adpn(DpadView dpadView, View view) {
        super(view);
        this.f = dpadView;
    }

    @Override // defpackage.akk
    protected final int k(float f, float f2) {
        adpo a = this.f.a(f, f2);
        if (a == null) {
            return CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        }
        int ordinal = a.ordinal();
        return ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? CellularSignalStrengthError.ERROR_NOT_SUPPORTED : R.id.dpadEnterKey : R.id.dpadRightKey : R.id.dpadLeftKey : R.id.dpadDownKey : R.id.dpadUpKey;
    }

    @Override // defpackage.akk
    protected final void m(List list) {
        list.add(Integer.valueOf(R.id.dpadLeftKey));
        list.add(Integer.valueOf(R.id.dpadRightKey));
        list.add(Integer.valueOf(R.id.dpadUpKey));
        list.add(Integer.valueOf(R.id.dpadDownKey));
        list.add(Integer.valueOf(R.id.dpadEnterKey));
    }

    @Override // defpackage.akk
    protected final void q(int i, ks ksVar) {
        adpo adpoVar;
        String str;
        if (i == R.id.dpadLeftKey) {
            adpoVar = adpo.LEFT;
        } else if (i == R.id.dpadRightKey) {
            adpoVar = adpo.RIGHT;
        } else if (i == R.id.dpadUpKey) {
            adpoVar = adpo.UP;
        } else if (i == R.id.dpadDownKey) {
            adpoVar = adpo.DOWN;
        } else {
            adpoVar = i == R.id.dpadEnterKey ? adpo.ENTER : null;
        }
        Context context = this.f.getContext();
        if (adpoVar != null) {
            Resources resources = context.getResources();
            int ordinal = adpoVar.ordinal();
            if (ordinal == 0) {
                str = resources.getString(R.string.mdx_dpad_up_contentDesc);
            } else if (ordinal == 1) {
                str = resources.getString(R.string.mdx_dpad_down_contentDesc);
            } else if (ordinal == 2) {
                str = resources.getString(R.string.mdx_dpad_left_contentDesc);
            } else if (ordinal == 3) {
                str = resources.getString(R.string.mdx_dpad_right_contentDesc);
            } else if (ordinal == 4) {
                str = resources.getString(R.string.mdx_dpad_enter_contentDesc);
            }
            ksVar.v(str);
            ksVar.n((Rect) this.f.b.get(adpoVar));
            ksVar.E(true);
            ksVar.y(true);
            ksVar.s(true);
            ksVar.h(16);
        }
        str = "";
        ksVar.v(str);
        ksVar.n((Rect) this.f.b.get(adpoVar));
        ksVar.E(true);
        ksVar.y(true);
        ksVar.s(true);
        ksVar.h(16);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.akk
    public final boolean u(int i, int i2) {
        return false;
    }
}
