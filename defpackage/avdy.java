package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avdy extends aonm implements aooz {
    public static final avdy a;
    private static volatile aopf p;
    public int b;
    public boolean c;
    public avdt d;
    public avdw e;
    public avdr f;
    public avdq g;
    public avdm h;
    public avdk i;
    public avdp j;
    public avdx k;
    public avdv l;
    public avdo m;
    public int n;
    public avds o;

    static {
        avdy avdyVar = new avdy();
        a = avdyVar;
        aonm.registerDefaultInstance(avdy.class, avdyVar);
    }

    private avdy() {
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
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\u001e\r\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0001\u0003ဉ\u0004\u0004ဉ\u0006\bဉ\b\tဉ\t\rဉ\f\u0017ဉ\u0016\u0018ဉ\u0017\u001aဉ\u0019\u001bင\u001a\u001cဉ\r\u001eဉ\u001c", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "k", "l", "m", "n", "j", "o"});
            case NEW_MUTABLE_INSTANCE:
                return new avdy();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = p;
                if (aopfVar == null) {
                    synchronized (avdy.class) {
                        aopfVar = p;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            p = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
