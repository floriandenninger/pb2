package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asvh extends aonm implements aooz {
    public static final asvh a;
    private static volatile aopf j;
    public int b;
    public aqyg c;
    public long d;
    public long e;
    public avgg f;
    public awnw g;
    public awnw h;
    public awnw i;
    private byte k = 2;

    static {
        asvh asvhVar = new asvh();
        a = asvhVar;
        aonm.registerDefaultInstance(asvh.class, asvhVar);
    }

    private asvh() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0002\t\u0007\u0000\u0000\u0005\u0002ᐉ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new asvh();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (asvh.class) {
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
