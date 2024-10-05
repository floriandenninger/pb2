package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.support.v7.view.menu.ListMenuItemView;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vj extends ug {
    final int c;
    final int d;
    public vi e;
    private MenuItem f;

    public vj(Context context, boolean z) {
        super(context, z);
        if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
            this.c = 21;
            this.d = 22;
        } else {
            this.c = 22;
            this.d = 21;
        }
    }

    @Override // defpackage.ug, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        qn qnVar;
        int i;
        vi viVar;
        vi viVar2;
        int pointToPosition;
        int i2;
        if (this.e != null) {
            ListAdapter adapter = getAdapter();
            int i3 = 0;
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                qnVar = (qn) headerViewListAdapter.getWrappedAdapter();
            } else {
                qnVar = (qn) adapter;
                i = 0;
            }
            qt item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = pointToPosition - i) < 0 || i2 >= qnVar.getCount()) ? null : qnVar.getItem(i2);
            MenuItem menuItem = this.f;
            if (menuItem != item) {
                qq qqVar = qnVar.a;
                if (menuItem != null && (viVar2 = ((vk) this.e).b) != null) {
                    ((qi) viVar2).a.a.removeCallbacksAndMessages(qqVar);
                }
                this.f = item;
                if (item != null && (viVar = ((vk) this.e).b) != null) {
                    qi qiVar = (qi) viVar;
                    qiVar.a.a.removeCallbacksAndMessages(null);
                    int size = qiVar.a.b.size();
                    while (true) {
                        if (i3 >= size) {
                            i3 = -1;
                            break;
                        }
                        if (qqVar == ((qj) qiVar.a.b.get(i3)).b) {
                            break;
                        }
                        i3++;
                    }
                    if (i3 != -1) {
                        int i4 = i3 + 1;
                        qiVar.a.a.postAtTime(new qh(qiVar, i4 < qiVar.a.b.size() ? (qj) qiVar.a.b.get(i4) : null, item, qqVar), qqVar, SystemClock.uptimeMillis() + 200);
                    }
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        qn qnVar;
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.c) {
            if (listMenuItemView.isEnabled() && listMenuItemView.a.hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.d) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        if (adapter instanceof HeaderViewListAdapter) {
            qnVar = (qn) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
        } else {
            qnVar = (qn) adapter;
        }
        qnVar.a.i(false);
        return true;
    }
}
