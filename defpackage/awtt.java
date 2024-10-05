package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awtt extends aonm implements aooz {
    public static final awtt a;
    public static final aonk b;
    private static volatile aopf q;
    public int c;
    public int d;
    public awnw e;
    public awpf f;
    public boolean g;
    public boolean h;
    public awnd i;
    public awnw j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public avfx p;
    private byte r = 2;

    static {
        awtt awttVar = new awtt();
        a = awttVar;
        aonm.registerDefaultInstance(awtt.class, awttVar);
        b = aonm.newSingularGeneratedExtension(awnw.a, awttVar, awttVar, null, 217165905, aoqn.MESSAGE, awtt.class);
    }

    private awtt() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.r);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.r = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0002\u0012\r\u0000\u0000\u0005\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ဌ\u0000\u0006ဇ\u0003\u0007ᐉ\u0005\bᐉ\u0006\tဌ\u0007\nဌ\b\u000bဇ\u0004\fဌ\t\rဌ\u000b\u000eᐉ\f\u0012ဌ\n", new Object[]{"c", "e", "f", "d", awnx.q, "g", "i", "j", "k", aric.a(), "l", arhn.a(), "h", "m", arhr.a(), "o", awnx.h, "p", "n", arib.a()});
            case NEW_MUTABLE_INSTANCE:
                return new awtt();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = q;
                if (aopfVar == null) {
                    synchronized (awtt.class) {
                        aopfVar = q;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            q = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
