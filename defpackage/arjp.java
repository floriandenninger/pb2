package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arjp extends aonm implements aooz {
    public static final arjp a;
    private static volatile aopf e;
    public Object c;
    public int b = 0;
    public aony d = aonm.emptyProtobufList();

    static {
        arjp arjpVar = new arjp();
        a = arjpVar;
        aonm.registerDefaultInstance(arjp.class, arjpVar);
    }

    private arjp() {
        aonm.emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000b\u0001\u0000\u0001\ueacc뮸\u000b\u0000\u0001\u0000\u0001\u001a\uec71㻕ြ\u0000ﻷ籜ြ\u0000\uf239缚ြ\u0000\ue779輆ြ\u0000\ue17a鄭ြ\u0000\ue8c6鈳ြ\u0000\uf646鲵ြ\u0000\ue9c1鴌ြ\u0000\ue62aꗧြ\u0000\ueacc뮸ြ\u0000", new Object[]{"c", "b", "d", avnz.class, aout.class, apps.class, aotp.class, arlu.class, avxy.class, awfs.class, avip.class, arka.class, aves.class});
            case NEW_MUTABLE_INSTANCE:
                return new arjp();
            case NEW_BUILDER:
                return new aone((boolean[][][]) null, (boolean[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (arjp.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            e = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
