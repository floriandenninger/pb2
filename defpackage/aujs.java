package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aujs extends aonm implements aooz {
    public static final aujs a;
    private static volatile aopf n;
    public int b;
    public boolean c;
    public aujz d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;

    static {
        aujs aujsVar = new aujs();
        a = aujsVar;
        aonm.registerDefaultInstance(aujs.class, aujsVar);
    }

    private aujs() {
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001!\u000b\u0000\u0000\u0000\u0001ဇ\u0000\fဉ\t\u000eဇ\u000b\u0011ဇ\u000e\u0016ဇ\u0010\u0017ဇ\u0012\u001aဇ\u0015\u001bဇ\u0016\u001dဇ\u0018\u001eဇ\u0011!ဇ\u001b", new Object[]{"b", "c", "d", "e", "f", "g", "i", "j", "k", "l", "h", "m"});
            case NEW_MUTABLE_INSTANCE:
                return new aujs();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = n;
                if (aopfVar == null) {
                    synchronized (aujs.class) {
                        aopfVar = n;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            n = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
