package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atei extends aonm implements aooz {
    public static final atei a;
    public static final aonk b;
    private static volatile aopf e;
    public Object d;
    public int c = 0;
    private byte f = 2;

    static {
        atei ateiVar = new atei();
        a = ateiVar;
        aonm.registerDefaultInstance(atei.class, ateiVar);
        b = aonm.newSingularGeneratedExtension(apxf.a, ateiVar, ateiVar, null, 247401431, aoqn.MESSAGE, atei.class);
    }

    private atei() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.f);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐼ\u0000", new Object[]{"d", "c", arvt.class});
            case NEW_MUTABLE_INSTANCE:
                return new atei();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (atei.class) {
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
