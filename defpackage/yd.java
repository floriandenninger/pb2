package defpackage;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yd extends aki implements View.OnClickListener {
    public int a;
    private final SearchView j;
    private final SearchableInfo k;
    private final Context l;
    private final WeakHashMap m;
    private final int n;
    private ColorStateList o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;

    public yd(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        super(context, searchView.getSuggestionRowLayout());
        this.a = 1;
        this.p = -1;
        this.q = -1;
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.j = searchView;
        this.k = searchableInfo;
        this.n = searchView.getSuggestionCommitIconResId();
        this.l = context;
        this.m = weakHashMap;
    }

    public static String c(Cursor cursor, String str) {
        return l(cursor, cursor.getColumnIndex(str));
    }

    private final Drawable i(String str) {
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.m.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private final Drawable j(Uri uri) {
        int parseInt;
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    String authority = uri.getAuthority();
                    if (TextUtils.isEmpty(authority)) {
                        throw new FileNotFoundException("No authority: " + uri);
                    }
                    try {
                        Resources resourcesForApplication = this.l.getPackageManager().getResourcesForApplication(authority);
                        List<String> pathSegments = uri.getPathSegments();
                        if (pathSegments == null) {
                            throw new FileNotFoundException("No path: " + uri);
                        }
                        int size = pathSegments.size();
                        if (size == 1) {
                            try {
                                parseInt = Integer.parseInt(pathSegments.get(0));
                            } catch (NumberFormatException unused) {
                                throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                            }
                        } else if (size == 2) {
                            parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                        } else {
                            throw new FileNotFoundException("More than two path segments: " + uri);
                        }
                        if (parseInt == 0) {
                            throw new FileNotFoundException("No resource found for: " + uri);
                        }
                        return resourcesForApplication.getDrawable(parseInt);
                    } catch (PackageManager.NameNotFoundException unused2) {
                        throw new FileNotFoundException("No package found for authority: " + uri);
                    }
                } catch (Resources.NotFoundException unused3) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream openInputStream = this.l.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                return Drawable.createFromStream(openInputStream, null);
            } finally {
                try {
                    openInputStream.close();
                } catch (IOException e) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e);
                }
            }
        } catch (FileNotFoundException e2) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e2.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e2.getMessage());
        return null;
    }

    private final Drawable k(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.l.getPackageName() + "/" + parseInt;
            Drawable i = i(str2);
            if (i != null) {
                return i;
            }
            Drawable a = aii.a(this.l, parseInt);
            m(str2, a);
            return a;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable i2 = i(str);
            if (i2 != null) {
                return i2;
            }
            Drawable j = j(Uri.parse(str));
            m(str, j);
            return j;
        }
    }

    private static String l(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    private final void m(String str, Drawable drawable) {
        if (drawable != null) {
            this.m.put(str, drawable.getConstantState());
        }
    }

    private static final void n(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    private static final void o(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    private static final void p(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0079 A[Catch: RuntimeException -> 0x007d, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x007d, blocks: (B:9:0x001e, B:13:0x0079, B:17:0x0024, B:20:0x002b, B:22:0x0048, B:23:0x004b, B:25:0x0056, B:26:0x0062, B:27:0x005e), top: B:8:0x001e }] */
    @Override // defpackage.akf, defpackage.akg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.database.Cursor a(java.lang.CharSequence r12) {
        /*
            r11 = this;
            java.lang.String r0 = "50"
            java.lang.String r1 = ""
            if (r12 != 0) goto L8
            r12 = r1
            goto Lc
        L8:
            java.lang.String r12 = r12.toString()
        Lc:
            android.support.v7.widget.SearchView r2 = r11.j
            int r2 = r2.getVisibility()
            r3 = 0
            if (r2 != 0) goto L85
            android.support.v7.widget.SearchView r2 = r11.j
            int r2 = r2.getWindowVisibility()
            if (r2 == 0) goto L1e
            goto L85
        L1e:
            android.app.SearchableInfo r2 = r11.k     // Catch: java.lang.RuntimeException -> L7d
            if (r2 != 0) goto L24
        L22:
            r12 = r3
            goto L77
        L24:
            java.lang.String r4 = r2.getSuggestAuthority()     // Catch: java.lang.RuntimeException -> L7d
            if (r4 != 0) goto L2b
            goto L22
        L2b:
            android.net.Uri$Builder r5 = new android.net.Uri$Builder     // Catch: java.lang.RuntimeException -> L7d
            r5.<init>()     // Catch: java.lang.RuntimeException -> L7d
            java.lang.String r6 = "content"
            android.net.Uri$Builder r5 = r5.scheme(r6)     // Catch: java.lang.RuntimeException -> L7d
            android.net.Uri$Builder r4 = r5.authority(r4)     // Catch: java.lang.RuntimeException -> L7d
            android.net.Uri$Builder r4 = r4.query(r1)     // Catch: java.lang.RuntimeException -> L7d
            android.net.Uri$Builder r1 = r4.fragment(r1)     // Catch: java.lang.RuntimeException -> L7d
            java.lang.String r4 = r2.getSuggestPath()     // Catch: java.lang.RuntimeException -> L7d
            if (r4 == 0) goto L4b
            r1.appendEncodedPath(r4)     // Catch: java.lang.RuntimeException -> L7d
        L4b:
            java.lang.String r4 = "search_suggest_query"
            r1.appendPath(r4)     // Catch: java.lang.RuntimeException -> L7d
            java.lang.String r8 = r2.getSuggestSelection()     // Catch: java.lang.RuntimeException -> L7d
            if (r8 == 0) goto L5e
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch: java.lang.RuntimeException -> L7d
            r4 = 0
            r2[r4] = r12     // Catch: java.lang.RuntimeException -> L7d
            r9 = r2
            goto L62
        L5e:
            r1.appendPath(r12)     // Catch: java.lang.RuntimeException -> L7d
            r9 = r3
        L62:
            java.lang.String r12 = "limit"
            r1.appendQueryParameter(r12, r0)     // Catch: java.lang.RuntimeException -> L7d
            android.net.Uri r6 = r1.build()     // Catch: java.lang.RuntimeException -> L7d
            android.content.Context r12 = r11.l     // Catch: java.lang.RuntimeException -> L7d
            android.content.ContentResolver r5 = r12.getContentResolver()     // Catch: java.lang.RuntimeException -> L7d
            r7 = 0
            r10 = 0
            android.database.Cursor r12 = r5.query(r6, r7, r8, r9, r10)     // Catch: java.lang.RuntimeException -> L7d
        L77:
            if (r12 == 0) goto L85
            r12.getCount()     // Catch: java.lang.RuntimeException -> L7d
            return r12
        L7d:
            r12 = move-exception
            java.lang.String r0 = "SuggestionsAdapter"
            java.lang.String r1 = "Search suggestions query threw an exception."
            android.util.Log.w(r0, r1, r12)
        L85:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yd.a(java.lang.CharSequence):android.database.Cursor");
    }

    @Override // defpackage.akf, defpackage.akg
    public final CharSequence b(Cursor cursor) {
        String c;
        String c2;
        if (cursor == null) {
            return null;
        }
        String c3 = c(cursor, "suggest_intent_query");
        if (c3 != null) {
            return c3;
        }
        if (this.k.shouldRewriteQueryFromData() && (c2 = c(cursor, "suggest_intent_data")) != null) {
            return c2;
        }
        if (!this.k.shouldRewriteQueryFromText() || (c = c(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0133  */
    @Override // defpackage.akf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(android.view.View r19, android.database.Cursor r20) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yd.e(android.view.View, android.database.Cursor):void");
    }

    @Override // defpackage.aki, defpackage.akf
    public final View f(ViewGroup viewGroup) {
        View inflate = this.i.inflate(this.h, viewGroup, false);
        inflate.setTag(new yc(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.n);
        return inflate;
    }

    @Override // defpackage.akf, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            if (!this.b) {
                return null;
            }
            this.d.moveToPosition(i);
            if (view == null) {
                view = h(viewGroup);
            }
            e(view, this.d);
            return view;
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View h = h(viewGroup);
            if (h != null) {
                ((yc) h.getTag()).a.setText(e.toString());
            }
            return h;
        }
    }

    @Override // defpackage.akf, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            if (!this.b) {
                throw new IllegalStateException("this should only be called when the cursor is valid");
            }
            if (!this.d.moveToPosition(i)) {
                throw new IllegalStateException("couldn't move cursor to position " + i);
            }
            if (view == null) {
                view = f(viewGroup);
            }
            e(view, this.d);
            return view;
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View f = f(viewGroup);
            if (f != null) {
                ((yc) f.getTag()).a.setText(e.toString());
            }
            return f;
        }
    }

    @Override // defpackage.akf, android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        p(this.d);
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        p(this.d);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.j.onQueryRefine((CharSequence) tag);
        }
    }

    @Override // defpackage.akf, defpackage.akg
    public final void d(Cursor cursor) {
        try {
            Cursor cursor2 = this.d;
            if (cursor == cursor2) {
                cursor2 = null;
            } else {
                if (cursor2 != null) {
                    akd akdVar = this.f;
                    if (akdVar != null) {
                        cursor2.unregisterContentObserver(akdVar);
                    }
                    DataSetObserver dataSetObserver = this.g;
                    if (dataSetObserver != null) {
                        cursor2.unregisterDataSetObserver(dataSetObserver);
                    }
                }
                this.d = cursor;
                if (cursor != null) {
                    akd akdVar2 = this.f;
                    if (akdVar2 != null) {
                        cursor.registerContentObserver(akdVar2);
                    }
                    DataSetObserver dataSetObserver2 = this.g;
                    if (dataSetObserver2 != null) {
                        cursor.registerDataSetObserver(dataSetObserver2);
                    }
                    this.e = cursor.getColumnIndexOrThrow("_id");
                    this.b = true;
                    notifyDataSetChanged();
                } else {
                    this.e = -1;
                    this.b = false;
                    notifyDataSetInvalidated();
                }
            }
            if (cursor2 != null) {
                cursor2.close();
            }
            if (cursor != null) {
                this.p = cursor.getColumnIndex("suggest_text_1");
                this.q = cursor.getColumnIndex("suggest_text_2");
                this.r = cursor.getColumnIndex("suggest_text_2_url");
                this.s = cursor.getColumnIndex("suggest_icon_1");
                this.t = cursor.getColumnIndex("suggest_icon_2");
                this.u = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }
}
