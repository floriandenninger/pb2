package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apik extends aonm implements aooz {
    public static final apik a;
    private static volatile aopf c;
    private Object d;
    public int b = 0;
    private byte e = 2;

    static {
        apik apikVar = new apik();
        a = apikVar;
        aonm.registerDefaultInstance(apik.class, apikVar);
    }

    private apik() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.e);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\ued3b䂎\uf7f0남\u0003\u0000\u0000\u0002\ued3b䂎ြ\u0000\ue469䑺ᐼ\u0000\uf7f0남ᐼ\u0000", new Object[]{"d", "b", apij.class, apil.class, apim.class});
            case NEW_MUTABLE_INSTANCE:
                return new apik();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (apik.class) {
                        aopfVar = c;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            c = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
