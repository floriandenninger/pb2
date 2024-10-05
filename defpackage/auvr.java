package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auvr extends aonh implements aoni {
    public static final auvr a;
    private static volatile aopf h;
    public int b;
    public boolean c;
    public boolean d;
    public asnp e;
    public apmh g;
    private byte i = 2;
    public String f = "";

    static {
        auvr auvrVar = new auvr();
        a = auvrVar;
        aonm.registerDefaultInstance(auvr.class, auvrVar);
    }

    private auvr() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0011\u001b\u0005\u0000\u0000\u0001\u0011ဉ\u0002\u0014ဇ\u0000\u0015ဇ\u0001\u001aᐉ\u0005\u001bဈ\u0004", new Object[]{"b", "e", "c", "d", "g", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new auvr();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (auvr.class) {
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
