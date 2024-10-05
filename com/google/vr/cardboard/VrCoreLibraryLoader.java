package com.google.vr.cardboard;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.vr.ndk.base.Version;
import com.google.vr.vrcore.base.api.VrCoreUtils;
import com.google.vr.vrcore.library.api.ObjectWrapper;
import defpackage.awxs;
import defpackage.axhh;
import defpackage.axij;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class VrCoreLibraryLoader {
    public static long loadNativeDlsymMethod(Context context) {
        if (Build.VERSION.SDK_INT > 23) {
            return 0L;
        }
        try {
            if (VrCoreUtils.getVrCoreClientApiVersion(context) < 14) {
                return 0L;
            }
            axij a = awxs.h(context).a(ObjectWrapper.a(awxs.g(context)), ObjectWrapper.a(context));
            if (a != null) {
                Parcel po = a.po(4, a.pn());
                long readLong = po.readLong();
                po.recycle();
                return readLong;
            }
            Log.e("VrCoreLibraryLoader", "Failed to load native dlsym handle from VrCore: no library loader available.");
            return 0L;
        } catch (RemoteException | axhh | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
            sb.append("Failed to load native dlsym handle from VrCore:\n  ");
            sb.append(valueOf);
            Log.e("VrCoreLibraryLoader", sb.toString());
            return 0L;
        }
    }

    public static long loadNativeGvrLibrary(Context context) {
        return loadNativeGvrLibrary(context, Version.MIN, Version.CURRENT);
    }

    public static long loadNativeGvrLibrary(Context context, Version version, Version version2) {
        try {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.google.vr.vrcore", 128);
                if (applicationInfo == null) {
                    throw new axhh(8);
                }
                if (!applicationInfo.enabled) {
                    throw new axhh(2);
                }
                if (applicationInfo.metaData == null) {
                    throw new axhh(4);
                }
                String string = applicationInfo.metaData.getString("com.google.vr.vrcore.SdkLibraryVersion", "");
                if (string.isEmpty()) {
                    throw new axhh(4);
                }
                String substring = string.substring(1);
                Version parse = Version.parse(substring);
                if (parse == null) {
                    throw new axhh(4);
                }
                if (parse.isAtLeast(version)) {
                    Context g = awxs.g(context);
                    awxs.g(context);
                    int i = awxs.a;
                    axij a = awxs.h(context).a(ObjectWrapper.a(g), ObjectWrapper.a(context));
                    if (a == null) {
                        Log.e("VrCoreLibraryLoader", "Failed to load native GVR library from VrCore: no library loader available.");
                        return 0L;
                    }
                    if (i < 19) {
                        int i2 = version2.majorVersion;
                        int i3 = version2.minorVersion;
                        int i4 = version2.patchVersion;
                        Parcel pn = a.pn();
                        pn.writeInt(i2);
                        pn.writeInt(i3);
                        pn.writeInt(i4);
                        Parcel po = a.po(2, pn);
                        long readLong = po.readLong();
                        po.recycle();
                        return readLong;
                    }
                    String version3 = version.toString();
                    String version4 = version2.toString();
                    Parcel pn2 = a.pn();
                    pn2.writeString(version3);
                    pn2.writeString(version4);
                    Parcel po2 = a.po(5, pn2);
                    long readLong2 = po2.readLong();
                    po2.recycle();
                    return readLong2;
                }
                Log.w("VrCoreLibraryLoader", String.format("VrCore GVR library version obsolete; VrCore supports %s but client min is %s", substring, version.toString()));
                throw new axhh(4);
            } catch (PackageManager.NameNotFoundException unused) {
                throw new axhh(VrCoreUtils.a(context));
            }
        } catch (RemoteException e) {
            e = e;
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
            sb.append("Failed to load native GVR library from VrCore:\n  ");
            sb.append(valueOf);
            Log.e("VrCoreLibraryLoader", sb.toString());
            return 0L;
        } catch (axhh e2) {
            e = e2;
            String valueOf2 = String.valueOf(e);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 49);
            sb2.append("Failed to load native GVR library from VrCore:\n  ");
            sb2.append(valueOf2);
            Log.e("VrCoreLibraryLoader", sb2.toString());
            return 0L;
        } catch (IllegalArgumentException e3) {
            e = e3;
            String valueOf22 = String.valueOf(e);
            StringBuilder sb22 = new StringBuilder(String.valueOf(valueOf22).length() + 49);
            sb22.append("Failed to load native GVR library from VrCore:\n  ");
            sb22.append(valueOf22);
            Log.e("VrCoreLibraryLoader", sb22.toString());
            return 0L;
        } catch (IllegalStateException e4) {
            e = e4;
            String valueOf222 = String.valueOf(e);
            StringBuilder sb222 = new StringBuilder(String.valueOf(valueOf222).length() + 49);
            sb222.append("Failed to load native GVR library from VrCore:\n  ");
            sb222.append(valueOf222);
            Log.e("VrCoreLibraryLoader", sb222.toString());
            return 0L;
        } catch (SecurityException e5) {
            e = e5;
            String valueOf2222 = String.valueOf(e);
            StringBuilder sb2222 = new StringBuilder(String.valueOf(valueOf2222).length() + 49);
            sb2222.append("Failed to load native GVR library from VrCore:\n  ");
            sb2222.append(valueOf2222);
            Log.e("VrCoreLibraryLoader", sb2222.toString());
            return 0L;
        } catch (UnsatisfiedLinkError e6) {
            e = e6;
            String valueOf22222 = String.valueOf(e);
            StringBuilder sb22222 = new StringBuilder(String.valueOf(valueOf22222).length() + 49);
            sb22222.append("Failed to load native GVR library from VrCore:\n  ");
            sb22222.append(valueOf22222);
            Log.e("VrCoreLibraryLoader", sb22222.toString());
            return 0L;
        }
    }
}
