package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awub extends aonm implements aooz {
    public static final awub a;
    public static final aonk b;
    private static volatile aopf j;
    public int c;
    public Object e;
    public int f;
    public awnw h;
    public int d = 0;
    private byte k = 2;
    public boolean g = true;
    public String i = "";

    static {
        awub awubVar = new awub();
        a = awubVar;
        aonm.registerDefaultInstance(awub.class, awubVar);
        b = aonm.newSingularGeneratedExtension(awqd.a, awubVar, awubVar, null, 272494533, aoqn.MESSAGE, awub.class);
    }

    private awub() {
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
                return newMessageInfo(a, "\u0001\u0006\u0001\u0001\u0002\t\u0006\u0000\u0000\u0001\u0002့\u0000\u0003ဴ\u0000\u0004င\u0003\u0007ဇ\u0006\bᐉ\u0007\tဈ\b", new Object[]{"e", "d", "c", "f", "g", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new awub();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (awub.class) {
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
