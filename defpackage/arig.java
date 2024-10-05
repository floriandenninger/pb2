package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arig extends aonm implements aooz {
    public static final arig a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        arig arigVar = new arig();
        a = arigVar;
        aonm.registerDefaultInstance(arig.class, arigVar);
    }

    private arig() {
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
                return newMessageInfo(a, "\u0001\u0005\u0001\u0000\uf143ᠤ\uf0bd㮜\u0005\u0000\u0000\u0005\uf143ᠤᐼ\u0000啕\u1cc9ᐼ\u0000\uec81⟕ᐼ\u0000\uf127⩲ᐼ\u0000\uf0bd㮜ᐼ\u0000", new Object[]{"c", "b", aqdb.class, ardf.class, arhz.class, awal.class, arif.class});
            case NEW_MUTABLE_INSTANCE:
                return new arig();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (arig.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
