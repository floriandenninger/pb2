package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awoq extends aonm implements aooz {
    public static final awoq a;
    public static final aonk b;
    private static volatile aopf h;
    public int c;
    public awnd d;
    public int e;
    public boolean f;
    public int g;
    private byte i = 2;

    static {
        awoq awoqVar = new awoq();
        a = awoqVar;
        aonm.registerDefaultInstance(awoq.class, awoqVar);
        b = aonm.newSingularGeneratedExtension(awpu.a, awoqVar, awoqVar, null, 194116769, aoqn.MESSAGE, awoq.class);
    }

    private awoq() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0002င\u0001\u0004ဇ\u0003\u0005င\u0004", new Object[]{"c", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new awoq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (awoq.class) {
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
