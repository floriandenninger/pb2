package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.measurement.api.internal.InitializationParams;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class rce extends ecq implements rcf {
    public rce() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static rcf asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        if (queryLocalInterface instanceof rcf) {
            return (rcf) queryLocalInterface;
        }
        return new rcd(iBinder);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        rci rcgVar;
        qvf qvdVar;
        qvf qvdVar2;
        qvf qvfVar;
        qvf qvdVar3;
        qvf qvdVar4;
        qvf qvdVar5;
        qvf qvdVar6;
        qvf qvfVar2;
        qvf qvfVar3 = null;
        rci rciVar = null;
        rci rciVar2 = null;
        rck rckVar = null;
        rck rckVar2 = null;
        rck rckVar3 = null;
        rci rciVar3 = null;
        rci rciVar4 = null;
        qvf qvfVar4 = null;
        qvf qvfVar5 = null;
        qvf qvfVar6 = null;
        qvf qvfVar7 = null;
        qvf qvfVar8 = null;
        qvf qvfVar9 = null;
        rci rciVar5 = null;
        rci rciVar6 = null;
        rci rciVar7 = null;
        rci rciVar8 = null;
        rcm rcmVar = null;
        rci rciVar9 = null;
        rci rciVar10 = null;
        rci rciVar11 = null;
        rci rciVar12 = null;
        rci rciVar13 = null;
        qvf qvfVar10 = null;
        rci rciVar14 = null;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface instanceof qvf) {
                        qvfVar3 = (qvf) queryLocalInterface;
                    } else {
                        qvfVar3 = new qvd(readStrongBinder);
                    }
                }
                initialize(qvfVar3, (InitializationParams) ecr.a(parcel, InitializationParams.CREATOR), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 2:
                logEvent(parcel.readString(), parcel.readString(), (Bundle) ecr.a(parcel, Bundle.CREATOR), ecr.j(parcel), ecr.j(parcel), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 3:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) ecr.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface2 instanceof rci) {
                        rcgVar = (rci) queryLocalInterface2;
                    } else {
                        rcgVar = new rcg(readStrongBinder2);
                    }
                    rciVar14 = rcgVar;
                }
                logEventAndBundle(readString, readString2, bundle, rciVar14, parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 4:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface3 instanceof qvf) {
                        qvdVar = (qvf) queryLocalInterface3;
                    } else {
                        qvdVar = new qvd(readStrongBinder3);
                    }
                    qvfVar10 = qvdVar;
                }
                setUserProperty(readString3, readString4, qvfVar10, ecr.j(parcel), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 5:
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                boolean j = ecr.j(parcel);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface4 instanceof rci) {
                        rciVar13 = (rci) queryLocalInterface4;
                    } else {
                        rciVar13 = new rcg(readStrongBinder4);
                    }
                }
                getUserProperties(readString5, readString6, j, rciVar13);
                parcel2.writeNoException();
                return true;
            case 6:
                String readString7 = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface5 instanceof rci) {
                        rciVar12 = (rci) queryLocalInterface5;
                    } else {
                        rciVar12 = new rcg(readStrongBinder5);
                    }
                }
                getMaxUserProperties(readString7, rciVar12);
                parcel2.writeNoException();
                return true;
            case 7:
                setUserId(parcel.readString(), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 8:
                setConditionalUserProperty((Bundle) ecr.a(parcel, Bundle.CREATOR), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 9:
                clearConditionalUserProperty(parcel.readString(), parcel.readString(), (Bundle) ecr.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 10:
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface6 instanceof rci) {
                        rciVar11 = (rci) queryLocalInterface6;
                    } else {
                        rciVar11 = new rcg(readStrongBinder6);
                    }
                }
                getConditionalUserProperties(readString8, readString9, rciVar11);
                parcel2.writeNoException();
                return true;
            case 11:
                setMeasurementEnabled(ecr.j(parcel), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 12:
                resetAnalyticsData(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 13:
                setMinimumSessionDuration(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 14:
                setSessionTimeoutDuration(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 15:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 == null) {
                    qvfVar = null;
                } else {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface7 instanceof qvf) {
                        qvdVar2 = (qvf) queryLocalInterface7;
                    } else {
                        qvdVar2 = new qvd(readStrongBinder7);
                    }
                    qvfVar = qvdVar2;
                }
                setCurrentScreen(qvfVar, parcel.readString(), parcel.readString(), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface8 instanceof rci) {
                        rciVar10 = (rci) queryLocalInterface8;
                    } else {
                        rciVar10 = new rcg(readStrongBinder8);
                    }
                }
                getCurrentScreenName(rciVar10);
                parcel2.writeNoException();
                return true;
            case 17:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface9 instanceof rci) {
                        rciVar9 = (rci) queryLocalInterface9;
                    } else {
                        rciVar9 = new rcg(readStrongBinder9);
                    }
                }
                getCurrentScreenClass(rciVar9);
                parcel2.writeNoException();
                return true;
            case 18:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    if (queryLocalInterface10 instanceof rcm) {
                        rcmVar = (rcm) queryLocalInterface10;
                    } else {
                        rcmVar = new rcl(readStrongBinder10);
                    }
                }
                setInstanceIdProvider(rcmVar);
                parcel2.writeNoException();
                return true;
            case 19:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface11 instanceof rci) {
                        rciVar8 = (rci) queryLocalInterface11;
                    } else {
                        rciVar8 = new rcg(readStrongBinder11);
                    }
                }
                getCachedAppInstanceId(rciVar8);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface12 instanceof rci) {
                        rciVar7 = (rci) queryLocalInterface12;
                    } else {
                        rciVar7 = new rcg(readStrongBinder12);
                    }
                }
                getAppInstanceId(rciVar7);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface13 instanceof rci) {
                        rciVar6 = (rci) queryLocalInterface13;
                    } else {
                        rciVar6 = new rcg(readStrongBinder13);
                    }
                }
                getGmpAppId(rciVar6);
                parcel2.writeNoException();
                return true;
            case 22:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface14 instanceof rci) {
                        rciVar5 = (rci) queryLocalInterface14;
                    } else {
                        rciVar5 = new rcg(readStrongBinder14);
                    }
                }
                generateEventId(rciVar5);
                parcel2.writeNoException();
                return true;
            case 23:
                beginAdUnitExposure(parcel.readString(), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 24:
                endAdUnitExposure(parcel.readString(), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 25:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface15 instanceof qvf) {
                        qvfVar9 = (qvf) queryLocalInterface15;
                    } else {
                        qvfVar9 = new qvd(readStrongBinder15);
                    }
                }
                onActivityStarted(qvfVar9, parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 26:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface16 instanceof qvf) {
                        qvfVar8 = (qvf) queryLocalInterface16;
                    } else {
                        qvfVar8 = new qvd(readStrongBinder16);
                    }
                }
                onActivityStopped(qvfVar8, parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 27:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface17 instanceof qvf) {
                        qvfVar7 = (qvf) queryLocalInterface17;
                    } else {
                        qvfVar7 = new qvd(readStrongBinder17);
                    }
                }
                onActivityCreated(qvfVar7, (Bundle) ecr.a(parcel, Bundle.CREATOR), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 28:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface18 instanceof qvf) {
                        qvfVar6 = (qvf) queryLocalInterface18;
                    } else {
                        qvfVar6 = new qvd(readStrongBinder18);
                    }
                }
                onActivityDestroyed(qvfVar6, parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 29:
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface19 instanceof qvf) {
                        qvfVar5 = (qvf) queryLocalInterface19;
                    } else {
                        qvfVar5 = new qvd(readStrongBinder19);
                    }
                }
                onActivityPaused(qvfVar5, parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 30:
                IBinder readStrongBinder20 = parcel.readStrongBinder();
                if (readStrongBinder20 != null) {
                    IInterface queryLocalInterface20 = readStrongBinder20.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface20 instanceof qvf) {
                        qvfVar4 = (qvf) queryLocalInterface20;
                    } else {
                        qvfVar4 = new qvd(readStrongBinder20);
                    }
                }
                onActivityResumed(qvfVar4, parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 31:
                IBinder readStrongBinder21 = parcel.readStrongBinder();
                if (readStrongBinder21 == null) {
                    qvdVar3 = null;
                } else {
                    IInterface queryLocalInterface21 = readStrongBinder21.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface21 instanceof qvf) {
                        qvdVar3 = (qvf) queryLocalInterface21;
                    } else {
                        qvdVar3 = new qvd(readStrongBinder21);
                    }
                }
                IBinder readStrongBinder22 = parcel.readStrongBinder();
                if (readStrongBinder22 != null) {
                    IInterface queryLocalInterface22 = readStrongBinder22.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface22 instanceof rci) {
                        rciVar4 = (rci) queryLocalInterface22;
                    } else {
                        rciVar4 = new rcg(readStrongBinder22);
                    }
                }
                onActivitySaveInstanceState(qvdVar3, rciVar4, parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 32:
                Bundle bundle2 = (Bundle) ecr.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder23 = parcel.readStrongBinder();
                if (readStrongBinder23 != null) {
                    IInterface queryLocalInterface23 = readStrongBinder23.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface23 instanceof rci) {
                        rciVar3 = (rci) queryLocalInterface23;
                    } else {
                        rciVar3 = new rcg(readStrongBinder23);
                    }
                }
                performAction(bundle2, rciVar3, parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 33:
                int readInt = parcel.readInt();
                String readString10 = parcel.readString();
                IBinder readStrongBinder24 = parcel.readStrongBinder();
                if (readStrongBinder24 == null) {
                    qvdVar4 = null;
                } else {
                    IInterface queryLocalInterface24 = readStrongBinder24.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface24 instanceof qvf) {
                        qvdVar4 = (qvf) queryLocalInterface24;
                    } else {
                        qvdVar4 = new qvd(readStrongBinder24);
                    }
                }
                IBinder readStrongBinder25 = parcel.readStrongBinder();
                if (readStrongBinder25 == null) {
                    qvdVar5 = null;
                } else {
                    IInterface queryLocalInterface25 = readStrongBinder25.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface25 instanceof qvf) {
                        qvdVar5 = (qvf) queryLocalInterface25;
                    } else {
                        qvdVar5 = new qvd(readStrongBinder25);
                    }
                }
                IBinder readStrongBinder26 = parcel.readStrongBinder();
                if (readStrongBinder26 == null) {
                    qvfVar2 = null;
                } else {
                    IInterface queryLocalInterface26 = readStrongBinder26.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface26 instanceof qvf) {
                        qvdVar6 = (qvf) queryLocalInterface26;
                    } else {
                        qvdVar6 = new qvd(readStrongBinder26);
                    }
                    qvfVar2 = qvdVar6;
                }
                logHealthData(readInt, readString10, qvdVar4, qvdVar5, qvfVar2);
                parcel2.writeNoException();
                return true;
            case 34:
                IBinder readStrongBinder27 = parcel.readStrongBinder();
                if (readStrongBinder27 != null) {
                    IInterface queryLocalInterface27 = readStrongBinder27.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface27 instanceof rck) {
                        rckVar3 = (rck) queryLocalInterface27;
                    } else {
                        rckVar3 = new rcj(readStrongBinder27);
                    }
                }
                setEventInterceptor(rckVar3);
                parcel2.writeNoException();
                return true;
            case 35:
                IBinder readStrongBinder28 = parcel.readStrongBinder();
                if (readStrongBinder28 != null) {
                    IInterface queryLocalInterface28 = readStrongBinder28.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface28 instanceof rck) {
                        rckVar2 = (rck) queryLocalInterface28;
                    } else {
                        rckVar2 = new rcj(readStrongBinder28);
                    }
                }
                registerOnMeasurementEventListener(rckVar2);
                parcel2.writeNoException();
                return true;
            case 36:
                IBinder readStrongBinder29 = parcel.readStrongBinder();
                if (readStrongBinder29 != null) {
                    IInterface queryLocalInterface29 = readStrongBinder29.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface29 instanceof rck) {
                        rckVar = (rck) queryLocalInterface29;
                    } else {
                        rckVar = new rcj(readStrongBinder29);
                    }
                }
                unregisterOnMeasurementEventListener(rckVar);
                parcel2.writeNoException();
                return true;
            case 37:
                initForTests(ecr.d(parcel));
                parcel2.writeNoException();
                return true;
            case 38:
                IBinder readStrongBinder30 = parcel.readStrongBinder();
                if (readStrongBinder30 != null) {
                    IInterface queryLocalInterface30 = readStrongBinder30.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface30 instanceof rci) {
                        rciVar2 = (rci) queryLocalInterface30;
                    } else {
                        rciVar2 = new rcg(readStrongBinder30);
                    }
                }
                getTestFlag(rciVar2, parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 39:
                setDataCollectionEnabled(ecr.j(parcel));
                parcel2.writeNoException();
                return true;
            case 40:
                IBinder readStrongBinder31 = parcel.readStrongBinder();
                if (readStrongBinder31 != null) {
                    IInterface queryLocalInterface31 = readStrongBinder31.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface31 instanceof rci) {
                        rciVar = (rci) queryLocalInterface31;
                    } else {
                        rciVar = new rcg(readStrongBinder31);
                    }
                }
                isDataCollectionEnabled(rciVar);
                parcel2.writeNoException();
                return true;
            case 41:
            default:
                return false;
            case 42:
                setDefaultEventParameters((Bundle) ecr.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 43:
                clearMeasurementEnabled(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 44:
                setConsent((Bundle) ecr.a(parcel, Bundle.CREATOR), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 45:
                setConsentThirdParty((Bundle) ecr.a(parcel, Bundle.CREATOR), parcel.readLong());
                parcel2.writeNoException();
                return true;
        }
    }
}
