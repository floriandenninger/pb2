package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tlh extends aonm implements aooz {
    public static final tlh a;
    private static volatile aopf h;
    public int b;
    public int d;
    public boolean e;
    public long f;
    public String c = "";
    public String g = "";

    static {
        tlh tlhVar = new tlh();
        a = tlhVar;
        aonm.registerDefaultInstance(tlh.class, tlhVar);
    }

    private tlh() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0004\n\u0005\u0000\u0000\u0000\u0004ဈ\u0000\u0005ဌ\u0001\bဇ\u0002\tဂ\u0003\nဈ\u0004", new Object[]{"b", "c", "d", tlc.b(), "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new tlh();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (tlh.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
