package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fof extends aonm implements aooz {
    public static final fof a;
    private static volatile aopf l;
    public int b;
    public boolean c;
    public boolean d;
    public int e;
    public aoot f = aoot.a;
    public boolean g;
    public int h;
    public int i;
    public int j;
    public int k;

    static {
        fof fofVar = new fof();
        a = fofVar;
        aonm.registerDefaultInstance(fof.class, fofVar);
    }

    private fof() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0001\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003င\u0002\u00042\u0005ဇ\u0003\u0006င\u0004\u0007င\u0005\bင\u0006\tင\u0007", new Object[]{"b", "c", "d", "e", "f", foe.a, "g", "h", "i", "j", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new fof();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = l;
                if (aopfVar == null) {
                    synchronized (fof.class) {
                        aopfVar = l;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            l = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
