package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qvu {
    private static Boolean e = null;
    private static String f = null;
    private static boolean g = false;
    private static int h = -1;
    private static qvv l;
    private static qvw m;
    public final Context d;
    private static final ThreadLocal i = new ThreadLocal();
    private static final ThreadLocal j = new qvl();
    private static final qvr k = new qvm();
    public static final qvt a = new qvn(1);
    public static final qvt b = new qvn(0);
    public static final qvt c = new qvn(2);

    private qvu(Context context) {
        qip.an(context);
        this.d = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".");
            sb.append("ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (!qar.j(declaredField.get(null), str)) {
                String valueOf = String.valueOf(declaredField.get(null));
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 51 + String.valueOf(str).length());
                sb2.append("Module descriptor id '");
                sb2.append(valueOf);
                sb2.append("' didn't match expected id '");
                sb2.append(str);
                sb2.append("'");
                Log.e("DynamiteModule", sb2.toString());
                return 0;
            }
            return declaredField2.getInt(null);
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e2) {
            String valueOf2 = String.valueOf(e2.getMessage());
            Log.e("DynamiteModule", valueOf2.length() != 0 ? "Failed to load module descriptor class: ".concat(valueOf2) : new String("Failed to load module descriptor class: "));
            return 0;
        }
    }

    public static int b(Context context, String str) {
        return c(context, str, false);
    }

    public static int c(Context context, String str, boolean z) {
        Field declaredField;
        Throwable th;
        RemoteException e2;
        int readInt;
        qvf qvdVar;
        Cursor cursor;
        try {
            synchronized (qvu.class) {
                Boolean bool = e;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e3) {
                        String valueOf = String.valueOf(e3);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
                        sb.append("Failed to load module via V2: ");
                        sb.append(valueOf);
                        Log.w("DynamiteModule", sb.toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader != null) {
                            if (classLoader == ClassLoader.getSystemClassLoader()) {
                                bool = Boolean.FALSE;
                            } else {
                                try {
                                    h(classLoader);
                                } catch (qvq unused) {
                                }
                                bool = Boolean.TRUE;
                            }
                        } else if (g || Boolean.TRUE.equals(null)) {
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        } else {
                            try {
                                int f2 = f(context, str, z);
                                String str2 = f;
                                if (str2 != null && !str2.isEmpty()) {
                                    ClassLoader a2 = qvj.a();
                                    if (a2 == null) {
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            String str3 = f;
                                            qip.an(str3);
                                            a2 = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                        } else {
                                            String str4 = f;
                                            qip.an(str4);
                                            a2 = new qvk(str4, ClassLoader.getSystemClassLoader());
                                        }
                                    }
                                    h(a2);
                                    declaredField.set(null, a2);
                                    e = Boolean.TRUE;
                                    return f2;
                                }
                                return f2;
                            } catch (qvq unused2) {
                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                bool = Boolean.FALSE;
                            }
                        }
                        e = bool;
                    }
                }
                if (!bool.booleanValue()) {
                    qvv j2 = j(context);
                    try {
                        if (j2 == null) {
                            return 0;
                        }
                        try {
                            int a3 = j2.a();
                            if (a3 >= 3) {
                                qvo qvoVar = (qvo) i.get();
                                if (qvoVar == null || (cursor = qvoVar.a) == null) {
                                    qvf a4 = qve.a(context);
                                    long longValue = ((Long) j.get()).longValue();
                                    Parcel pn = j2.pn();
                                    ecr.i(pn, a4);
                                    pn.writeString(str);
                                    ecr.e(pn, z);
                                    pn.writeLong(longValue);
                                    Parcel po = j2.po(7, pn);
                                    IBinder readStrongBinder = po.readStrongBinder();
                                    if (readStrongBinder == null) {
                                        qvdVar = null;
                                    } else {
                                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                        if (queryLocalInterface instanceof qvf) {
                                            qvdVar = (qvf) queryLocalInterface;
                                        } else {
                                            qvdVar = new qvd(readStrongBinder);
                                        }
                                    }
                                    po.recycle();
                                    Cursor cursor2 = (Cursor) qve.b(qvdVar);
                                    if (cursor2 != null) {
                                        try {
                                            if (cursor2.moveToFirst()) {
                                                readInt = cursor2.getInt(0);
                                                r2 = (readInt <= 0 || !i(cursor2)) ? cursor2 : null;
                                                if (r2 != null) {
                                                    r2.close();
                                                }
                                            }
                                        } catch (RemoteException e4) {
                                            e2 = e4;
                                            r2 = cursor2;
                                            String valueOf2 = String.valueOf(e2.getMessage());
                                            Log.w("DynamiteModule", valueOf2.length() != 0 ? "Failed to retrieve remote module version: ".concat(valueOf2) : new String("Failed to retrieve remote module version: "));
                                            if (r2 == null) {
                                                return 0;
                                            }
                                            r2.close();
                                            return 0;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            r2 = cursor2;
                                            if (r2 != null) {
                                                r2.close();
                                            }
                                            throw th;
                                        }
                                    }
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                    if (cursor2 == null) {
                                        return 0;
                                    }
                                    cursor2.close();
                                    return 0;
                                }
                                return cursor.getInt(0);
                            }
                            if (a3 == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                qvf a5 = qve.a(context);
                                Parcel pn2 = j2.pn();
                                ecr.i(pn2, a5);
                                pn2.writeString(str);
                                ecr.e(pn2, z);
                                Parcel po2 = j2.po(5, pn2);
                                readInt = po2.readInt();
                                po2.recycle();
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                qvf a6 = qve.a(context);
                                Parcel pn3 = j2.pn();
                                ecr.i(pn3, a6);
                                pn3.writeString(str);
                                ecr.e(pn3, z);
                                Parcel po3 = j2.po(3, pn3);
                                readInt = po3.readInt();
                                po3.recycle();
                            }
                            return readInt;
                        } catch (RemoteException e5) {
                            e2 = e5;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } else {
                    try {
                        return f(context, str, z);
                    } catch (qvq e6) {
                        String valueOf3 = String.valueOf(e6.getMessage());
                        Log.w("DynamiteModule", valueOf3.length() != 0 ? "Failed to retrieve remote module version: ".concat(valueOf3) : new String("Failed to retrieve remote module version: "));
                        return 0;
                    }
                }
            }
        } catch (Throwable th4) {
            oba.af(context);
            throw th4;
        }
    }

    public static qvu e(Context context, qvt qvtVar, String str) {
        Boolean bool;
        qvu qvuVar;
        qvw qvwVar;
        Boolean valueOf;
        ThreadLocal threadLocal = i;
        qvo qvoVar = (qvo) threadLocal.get();
        qvo qvoVar2 = new qvo();
        threadLocal.set(qvoVar2);
        ThreadLocal threadLocal2 = j;
        long longValue = ((Long) threadLocal2.get()).longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            qvs a2 = qvtVar.a(context, str, k);
            String.valueOf(str).length();
            String.valueOf(str).length();
            int i2 = a2.c;
            if (i2 == 0 || ((i2 == -1 && a2.a == 0) || (i2 == 1 && a2.b == 0))) {
                int i3 = a2.a;
                int i4 = a2.b;
                StringBuilder sb = new StringBuilder(91);
                sb.append("No acceptable module found. Local version is ");
                sb.append(i3);
                sb.append(" and remote version is ");
                sb.append(i4);
                sb.append(".");
                throw new qvq(sb.toString());
            }
            if (i2 == -1) {
                qvu g2 = g(context, str);
                if (longValue == 0) {
                    threadLocal2.remove();
                } else {
                    threadLocal2.set(Long.valueOf(longValue));
                }
                Cursor cursor = qvoVar2.a;
                if (cursor != null) {
                    cursor.close();
                }
                threadLocal.set(qvoVar);
                return g2;
            }
            if (i2 != 1) {
                StringBuilder sb2 = new StringBuilder(47);
                sb2.append("VersionPolicy returned invalid code:");
                sb2.append(0);
                throw new qvq(sb2.toString());
            }
            try {
                int i5 = a2.b;
                try {
                    synchronized (qvu.class) {
                        bool = e;
                    }
                    if (bool == null) {
                        throw new qvq("Failed to determine which loading route to use.");
                    }
                    qvf qvfVar = null;
                    if (bool.booleanValue()) {
                        String.valueOf(str).length();
                        synchronized (qvu.class) {
                            qvwVar = m;
                        }
                        if (qvwVar == null) {
                            throw new qvq("DynamiteLoaderV2 was not cached.");
                        }
                        qvo qvoVar3 = (qvo) threadLocal.get();
                        if (qvoVar3 == null || qvoVar3.a == null) {
                            throw new qvq("No result cursor");
                        }
                        Context applicationContext = context.getApplicationContext();
                        Cursor cursor2 = qvoVar3.a;
                        qve.a(null);
                        synchronized (qvu.class) {
                            valueOf = Boolean.valueOf(h >= 2);
                        }
                        if (valueOf.booleanValue()) {
                            qvf a3 = qve.a(applicationContext);
                            qvf a4 = qve.a(cursor2);
                            Parcel pn = qvwVar.pn();
                            ecr.i(pn, a3);
                            pn.writeString(str);
                            pn.writeInt(i5);
                            ecr.i(pn, a4);
                            Parcel po = qvwVar.po(3, pn);
                            IBinder readStrongBinder = po.readStrongBinder();
                            if (readStrongBinder != null) {
                                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                qvfVar = queryLocalInterface instanceof qvf ? (qvf) queryLocalInterface : new qvd(readStrongBinder);
                            }
                            po.recycle();
                        } else {
                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                            qvf a5 = qve.a(applicationContext);
                            qvf a6 = qve.a(cursor2);
                            Parcel pn2 = qvwVar.pn();
                            ecr.i(pn2, a5);
                            pn2.writeString(str);
                            pn2.writeInt(i5);
                            ecr.i(pn2, a6);
                            Parcel po2 = qvwVar.po(2, pn2);
                            IBinder readStrongBinder2 = po2.readStrongBinder();
                            if (readStrongBinder2 != null) {
                                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                qvfVar = queryLocalInterface2 instanceof qvf ? (qvf) queryLocalInterface2 : new qvd(readStrongBinder2);
                            }
                            po2.recycle();
                        }
                        Context context2 = (Context) qve.b(qvfVar);
                        if (context2 == null) {
                            throw new qvq("Failed to get module context");
                        }
                        qvuVar = new qvu(context2);
                    } else {
                        String.valueOf(str).length();
                        qvv j2 = j(context);
                        if (j2 == null) {
                            throw new qvq("Failed to create IDynamiteLoader.");
                        }
                        int a7 = j2.a();
                        if (a7 >= 3) {
                            qvo qvoVar4 = (qvo) threadLocal.get();
                            if (qvoVar4 == null) {
                                throw new qvq("No cached result cursor holder");
                            }
                            qvf a8 = qve.a(context);
                            qvf a9 = qve.a(qvoVar4.a);
                            Parcel pn3 = j2.pn();
                            ecr.i(pn3, a8);
                            pn3.writeString(str);
                            pn3.writeInt(i5);
                            ecr.i(pn3, a9);
                            Parcel po3 = j2.po(8, pn3);
                            IBinder readStrongBinder3 = po3.readStrongBinder();
                            if (readStrongBinder3 != null) {
                                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                qvfVar = queryLocalInterface3 instanceof qvf ? (qvf) queryLocalInterface3 : new qvd(readStrongBinder3);
                            }
                            po3.recycle();
                        } else if (a7 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                            qvf a10 = qve.a(context);
                            Parcel pn4 = j2.pn();
                            ecr.i(pn4, a10);
                            pn4.writeString(str);
                            pn4.writeInt(i5);
                            Parcel po4 = j2.po(4, pn4);
                            IBinder readStrongBinder4 = po4.readStrongBinder();
                            if (readStrongBinder4 != null) {
                                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                qvfVar = queryLocalInterface4 instanceof qvf ? (qvf) queryLocalInterface4 : new qvd(readStrongBinder4);
                            }
                            po4.recycle();
                        } else {
                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                            qvf a11 = qve.a(context);
                            Parcel pn5 = j2.pn();
                            ecr.i(pn5, a11);
                            pn5.writeString(str);
                            pn5.writeInt(i5);
                            Parcel po5 = j2.po(2, pn5);
                            IBinder readStrongBinder5 = po5.readStrongBinder();
                            if (readStrongBinder5 != null) {
                                IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                qvfVar = queryLocalInterface5 instanceof qvf ? (qvf) queryLocalInterface5 : new qvd(readStrongBinder5);
                            }
                            po5.recycle();
                        }
                        if (qve.b(qvfVar) == null) {
                            throw new qvq("Failed to load remote module.");
                        }
                        qvuVar = new qvu((Context) qve.b(qvfVar));
                    }
                    if (longValue == 0) {
                        threadLocal2.remove();
                    } else {
                        threadLocal2.set(Long.valueOf(longValue));
                    }
                    Cursor cursor3 = qvoVar2.a;
                    if (cursor3 != null) {
                        cursor3.close();
                    }
                    threadLocal.set(qvoVar);
                    return qvuVar;
                } catch (RemoteException e2) {
                    throw new qvq("Failed to load remote module.", e2);
                } catch (qvq e3) {
                    throw e3;
                } catch (Throwable th) {
                    oba.af(context);
                    throw new qvq("Failed to load remote module.", th);
                }
            } catch (qvq e4) {
                String valueOf2 = String.valueOf(e4.getMessage());
                Log.w("DynamiteModule", valueOf2.length() != 0 ? "Failed to load remote module: ".concat(valueOf2) : new String("Failed to load remote module: "));
                int i6 = a2.a;
                if (i6 == 0 || qvtVar.a(context, str, new qvp(i6)).c != -1) {
                    throw new qvq("Remote load failed. No local fallback found.", e4);
                }
                qvu g3 = g(context, str);
                if (longValue == 0) {
                    j.remove();
                } else {
                    j.set(Long.valueOf(longValue));
                }
                Cursor cursor4 = qvoVar2.a;
                if (cursor4 != null) {
                    cursor4.close();
                }
                i.set(qvoVar);
                return g3;
            }
        } catch (Throwable th2) {
            if (longValue == 0) {
                j.remove();
            } else {
                j.set(Long.valueOf(longValue));
            }
            Cursor cursor5 = qvoVar2.a;
            if (cursor5 != null) {
                cursor5.close();
            }
            i.set(qvoVar);
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
    
        if (i(r10) != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int f(android.content.Context r10, java.lang.String r11, boolean r12) {
        /*
            r0 = 0
            java.lang.ThreadLocal r1 = defpackage.qvu.j     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            long r1 = r1.longValue()     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            java.lang.String r10 = "api_force_staging"
            java.lang.String r4 = "api"
            r9 = 1
            if (r9 == r12) goto L19
            r10 = r4
        L19:
            android.net.Uri$Builder r12 = new android.net.Uri$Builder     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            r12.<init>()     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            java.lang.String r4 = "content"
            android.net.Uri$Builder r12 = r12.scheme(r4)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r12 = r12.authority(r4)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            android.net.Uri$Builder r10 = r12.path(r10)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            android.net.Uri$Builder r10 = r10.appendPath(r11)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            java.lang.String r11 = "requestStartTime"
            java.lang.String r12 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            android.net.Uri$Builder r10 = r10.appendQueryParameter(r11, r12)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            android.net.Uri r4 = r10.build()     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            if (r10 == 0) goto La2
            boolean r11 = r10.moveToFirst()     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb5
            if (r11 == 0) goto La2
            r11 = 0
            int r12 = r10.getInt(r11)     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb5
            if (r12 <= 0) goto L8d
            java.lang.Class<qvu> r1 = defpackage.qvu.class
            monitor-enter(r1)     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb5
            r2 = 2
            java.lang.String r2 = r10.getString(r2)     // Catch: java.lang.Throwable -> L8a
            defpackage.qvu.f = r2     // Catch: java.lang.Throwable -> L8a
            java.lang.String r2 = "loaderVersion"
            int r2 = r10.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L8a
            if (r2 < 0) goto L6f
            int r2 = r10.getInt(r2)     // Catch: java.lang.Throwable -> L8a
            defpackage.qvu.h = r2     // Catch: java.lang.Throwable -> L8a
        L6f:
            java.lang.String r2 = "disableStandaloneDynamiteLoader"
            int r2 = r10.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L8a
            if (r2 < 0) goto L82
            int r2 = r10.getInt(r2)     // Catch: java.lang.Throwable -> L8a
            if (r2 == 0) goto L7e
            goto L7f
        L7e:
            r9 = 0
        L7f:
            defpackage.qvu.g = r9     // Catch: java.lang.Throwable -> L8a
            r11 = r9
        L82:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8a
            boolean r1 = i(r10)     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb5
            if (r1 == 0) goto L8d
            goto L8e
        L8a:
            r11 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8a
            throw r11     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb5
        L8d:
            r0 = r10
        L8e:
            if (r11 != 0) goto L96
            if (r0 == 0) goto L95
            r0.close()
        L95:
            return r12
        L96:
            qvq r10 = new qvq     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            java.lang.String r11 = "forcing fallback to container DynamiteLoader impl"
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            throw r10     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
        L9e:
            r10 = move-exception
            goto Lc6
        La0:
            r10 = move-exception
            goto Lb8
        La2:
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r12 = "Failed to retrieve remote module version."
            android.util.Log.w(r11, r12)     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb5
            qvq r11 = new qvq     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb5
            java.lang.String r12 = "Failed to connect to dynamite module ContentResolver."
            r11.<init>(r12)     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb5
            throw r11     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb5
        Lb1:
            r11 = move-exception
            r0 = r10
            r10 = r11
            goto Lc6
        Lb5:
            r11 = move-exception
            r0 = r10
            r10 = r11
        Lb8:
            boolean r11 = r10 instanceof defpackage.qvq     // Catch: java.lang.Throwable -> L9e
            if (r11 == 0) goto Lbe
            throw r10     // Catch: java.lang.Throwable -> L9e
        Lbe:
            qvq r11 = new qvq     // Catch: java.lang.Throwable -> L9e
            java.lang.String r12 = "V2 version check failed"
            r11.<init>(r12, r10)     // Catch: java.lang.Throwable -> L9e
            throw r11     // Catch: java.lang.Throwable -> L9e
        Lc6:
            if (r0 == 0) goto Lcb
            r0.close()
        Lcb:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qvu.f(android.content.Context, java.lang.String, boolean):int");
    }

    private static qvu g(Context context, String str) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "Selected local version of ".concat(valueOf);
        }
        return new qvu(context.getApplicationContext());
    }

    private static void h(ClassLoader classLoader) {
        qvw qvwVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                qvwVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof qvw) {
                    qvwVar = (qvw) queryLocalInterface;
                } else {
                    qvwVar = new qvw(iBinder);
                }
            }
            m = qvwVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new qvq("Failed to instantiate dynamite loader", e2);
        }
    }

    private static boolean i(Cursor cursor) {
        qvo qvoVar = (qvo) i.get();
        if (qvoVar == null || qvoVar.a != null) {
            return false;
        }
        qvoVar.a = cursor;
        return true;
    }

    private static qvv j(Context context) {
        qvv qvvVar;
        synchronized (qvu.class) {
            qvv qvvVar2 = l;
            if (qvvVar2 != null) {
                return qvvVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    qvvVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    if (queryLocalInterface instanceof qvv) {
                        qvvVar = (qvv) queryLocalInterface;
                    } else {
                        qvvVar = new qvv(iBinder);
                    }
                }
                if (qvvVar != null) {
                    l = qvvVar;
                    return qvvVar;
                }
            } catch (Exception e2) {
                String valueOf = String.valueOf(e2.getMessage());
                Log.e("DynamiteModule", valueOf.length() != 0 ? "Failed to load IDynamiteLoader from GmsCore: ".concat(valueOf) : new String("Failed to load IDynamiteLoader from GmsCore: "));
            }
            return null;
        }
    }

    public final IBinder d(String str) {
        try {
            return (IBinder) this.d.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new qvq(str.length() != 0 ? "Failed to instantiate module class: ".concat(str) : new String("Failed to instantiate module class: "), e2);
        }
    }
}
