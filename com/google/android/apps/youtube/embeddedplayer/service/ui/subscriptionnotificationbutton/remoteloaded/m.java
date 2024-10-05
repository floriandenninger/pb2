package com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuItem;
import com.google.android.youtube.R;
import defpackage.alta;
import defpackage.amru;
import defpackage.hw;
import defpackage.yjk;
import java.util.List;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class m implements i {
    public PopupWindow b;
    public boolean c;
    private final Context d;

    public m(Context context) {
        this.d = context;
    }

    private final Drawable d(int i) {
        Resources resources = this.d.getResources();
        if (i == 1) {
            return resources.getDrawable(R.drawable.quantum_gm_ic_notifications_off_grey600_24);
        }
        if (i == 2) {
            return resources.getDrawable(R.drawable.quantum_gm_ic_notifications_grey600_24);
        }
        if (i != 3) {
            return null;
        }
        return resources.getDrawable(R.drawable.quantum_gm_ic_notifications_active_grey600_24);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.i
    public final void a(SubscriptionNotificationMenuData subscriptionNotificationMenuData, int i, final View view, final hw hwVar) {
        Window window;
        SubscriptionNotificationMenuItem subscriptionNotificationMenuItem;
        final amru amruVar = subscriptionNotificationMenuData.b;
        b();
        ViewGroup viewGroup = null;
        final ViewGroup viewGroup2 = (ViewGroup) View.inflate(this.d, R.layout.subscription_notification_menu, null);
        int i2 = -1;
        int i3 = 0;
        while (i3 < amruVar.size()) {
            final SubscriptionNotificationMenuItem subscriptionNotificationMenuItem2 = (SubscriptionNotificationMenuItem) amruVar.get(i3);
            final View inflate = View.inflate(this.d, R.layout.subscription_notification_menu_item, viewGroup);
            boolean z = subscriptionNotificationMenuItem2.b() == i;
            final boolean z2 = z;
            int i4 = i2;
            int i5 = i3;
            inflate.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    final m mVar = m.this;
                    View view3 = inflate;
                    ViewGroup viewGroup3 = viewGroup2;
                    List list = amruVar;
                    View view4 = view;
                    final boolean z3 = z2;
                    final hw hwVar2 = hwVar;
                    final SubscriptionNotificationMenuItem subscriptionNotificationMenuItem3 = subscriptionNotificationMenuItem2;
                    if (mVar.c) {
                        return;
                    }
                    mVar.c = true;
                    Integer num = (Integer) view3.getTag();
                    for (int i6 = 0; i6 < viewGroup3.getChildCount(); i6++) {
                        View childAt = viewGroup3.getChildAt(i6);
                        Integer num2 = (Integer) childAt.getTag();
                        mVar.c(childAt, (SubscriptionNotificationMenuItem) list.get(i6), (num == null || num2 == null) ? false : num.equals(num2));
                    }
                    view4.postDelayed(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            m mVar2 = m.this;
                            boolean z4 = z3;
                            hw hwVar3 = hwVar2;
                            SubscriptionNotificationMenuItem subscriptionNotificationMenuItem4 = subscriptionNotificationMenuItem3;
                            mVar2.b();
                            if (z4) {
                                return;
                            }
                            hwVar3.accept(subscriptionNotificationMenuItem4);
                        }
                    }, 500L);
                }
            });
            inflate.setBackgroundColor(this.d.getResources().getColor(R.color.subscription_notification_menu_item_unselected));
            TextView textView = (TextView) inflate.findViewById(R.id.text);
            textView.setText(subscriptionNotificationMenuItem2.e());
            textView.setContentDescription(subscriptionNotificationMenuItem2.d());
            ((ImageView) inflate.findViewById(R.id.icon)).setImageDrawable(d(subscriptionNotificationMenuItem2.a()));
            if (z) {
                i2 = viewGroup2.getChildCount();
                subscriptionNotificationMenuItem = subscriptionNotificationMenuItem2;
                c(inflate, subscriptionNotificationMenuItem, true);
            } else {
                subscriptionNotificationMenuItem = subscriptionNotificationMenuItem2;
                i2 = i4;
            }
            viewGroup2.addView(inflate);
            inflate.setTag(Integer.valueOf(subscriptionNotificationMenuItem.b()));
            i3 = i5 + 1;
            viewGroup = null;
        }
        if (i2 == -1) {
            alta.B("Could not find the item for the current state!", new Object[0]);
            return;
        }
        viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(yjk.N(this.d), CellularSignalStrengthError.ERROR_NOT_SUPPORTED), View.MeasureSpec.makeMeasureSpec(yjk.L(this.d), CellularSignalStrengthError.ERROR_NOT_SUPPORTED));
        int i6 = 0;
        for (int i7 = 0; i7 < i2; i7++) {
            i6 += viewGroup2.getChildAt(i7).getMeasuredHeight();
        }
        PopupWindow popupWindow = new PopupWindow((View) viewGroup2, -2, -2, true);
        this.b = popupWindow;
        popupWindow.setElevation(yjk.K(this.d.getResources().getDisplayMetrics(), 4));
        this.b.setBackgroundDrawable(new ColorDrawable(this.d.getResources().getColor(R.color.subscription_notification_menu_item_unselected)));
        this.b.setOutsideTouchable(true);
        this.b.setAnimationStyle(android.R.style.Animation.Dialog);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        Point point = new Point(iArr[0], iArr[1]);
        int i8 = point.x;
        int measuredWidth = viewGroup2.getMeasuredWidth();
        int width = view.getWidth();
        int paddingEnd = view.getPaddingEnd();
        int paddingEnd2 = viewGroup2.getChildAt(0).getPaddingEnd();
        int height = (point.y - i6) + ((view.getHeight() - viewGroup2.getChildAt(0).getMeasuredHeight()) / 2);
        int measuredHeight = viewGroup2.getMeasuredHeight();
        final int i9 = (((i8 - measuredWidth) + width) - paddingEnd) + paddingEnd2;
        hw hwVar2 = new hw() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.j
            @Override // defpackage.hw
            public final void accept(Object obj) {
                m mVar = m.this;
                View view2 = view;
                int i10 = i9;
                Integer num = (Integer) obj;
                PopupWindow popupWindow2 = mVar.b;
                if (popupWindow2 == null) {
                    return;
                }
                popupWindow2.showAtLocation(view2, 0, i10, num.intValue());
            }
        };
        Context context = this.d;
        View decorView = (!(context instanceof Activity) || (window = ((Activity) context).getWindow()) == null) ? null : window.getDecorView();
        if (decorView == null) {
            hwVar2.accept(Integer.valueOf(height));
            return;
        }
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int i10 = rect.top;
        if (height < i10) {
            height = i10;
        }
        if (height + measuredHeight > rect.bottom) {
            height = rect.bottom - measuredHeight;
        }
        hwVar2.accept(Integer.valueOf(height));
    }

    public final void b() {
        PopupWindow popupWindow = this.b;
        if (popupWindow != null) {
            popupWindow.dismiss();
            this.b = null;
        }
        this.c = false;
    }

    public final void c(View view, SubscriptionNotificationMenuItem subscriptionNotificationMenuItem, boolean z) {
        Drawable drawable;
        ImageView imageView = (ImageView) view.findViewById(R.id.icon);
        if (z) {
            view.setBackgroundColor(this.d.getResources().getColor(R.color.subscription_notification_menu_item_selected));
            int a = subscriptionNotificationMenuItem.a();
            Resources resources = this.d.getResources();
            if (a == 1) {
                drawable = resources.getDrawable(R.drawable.quantum_ic_notifications_off_grey600_24);
            } else if (a != 2) {
                drawable = a != 3 ? null : resources.getDrawable(R.drawable.quantum_ic_notifications_active_grey600_24);
            } else {
                drawable = resources.getDrawable(R.drawable.quantum_ic_notifications_grey600_24);
            }
            imageView.setImageDrawable(drawable);
            return;
        }
        view.setBackgroundColor(this.d.getResources().getColor(R.color.subscription_notification_menu_item_unselected));
        imageView.setImageDrawable(d(subscriptionNotificationMenuItem.a()));
    }
}
