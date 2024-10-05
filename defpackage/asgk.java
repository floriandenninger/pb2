package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asgk extends aonm implements aooz {
    public static final asgk a;
    private static volatile aopf k;
    public int b;
    public aulq c;
    public aulq d;
    public aulq e;
    public aulq f;
    public aulq g;
    public aulq h;
    public aowz j;
    private aulq l;
    private aulq m;
    private aota n;
    private aulq o;
    private byte p = 2;
    public aomf i = aomf.b;

    static {
        asgk asgkVar = new asgk();
        a = asgkVar;
        aonm.registerDefaultInstance(asgk.class, asgkVar);
    }

    private asgk() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.p);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.p = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\u000e\f\u0000\u0000\n\u0001ᐉ\u0000\u0002ᐉ\u0007\u0003ည\n\u0004ᐉ\u0001\u0006ᐉ\u0003\u0007ᐉ\u0004\bᐉ\u0005\tᐉ\u0002\nᐉ\b\u000bᐉ\t\rᐉ\u0006\u000eဉ\f", new Object[]{"b", "c", "n", "i", "d", "l", "f", "m", "e", "h", "o", "g", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new asgk();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (asgk.class) {
                        aopfVar = k;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            k = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
