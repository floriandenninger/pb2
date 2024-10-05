package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqcs extends aonm implements aooz {
    public static final aqcs a;
    private static volatile aopf j;
    public int b;
    public long c;
    public float d;
    public int e;
    public int f;
    public int g;
    public long h;
    public long i;

    static {
        aqcs aqcsVar = new aqcs();
        a = aqcsVar;
        aonm.registerDefaultInstance(aqcs.class, aqcsVar);
    }

    private aqcs() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ခ\u0001\u0003င\u0002\u0004င\u0003\u0005ဌ\u0004\u0006ဂ\u0005\u0007ဂ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", aqkw.b, "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new aqcs();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (aqcs.class) {
                        aopfVar = j;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            j = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
