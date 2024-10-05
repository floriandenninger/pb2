package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apbs extends aonm implements aooz {
    public static final apbs a;
    private static volatile aopf y;
    private int A;
    private int B;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    private int z;

    static {
        apbs apbsVar = new apbs();
        a = apbsVar;
        aonm.registerDefaultInstance(apbs.class, apbsVar);
    }

    private apbs() {
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
                return newMessageInfo(a, "\u0001\u0017\u0000\u00033\u009e\u0017\u0000\u0000\u00003ဇ\u00104ဇ\u0011qဇ!|ဇ,~ဇ/\u0080ဇ1\u0082ဇ3\u0083ဇ.\u0086ဇ6\u0087ဇ7\u0088ဇ8\u008cဇ<\u008dဇ=\u008eဇ>\u008fဇ?\u0090ဇ@\u0094ဇD\u0096ဇF\u0097ဇG\u0099ဇI\u009aဇJ\u009cဇL\u009eဇM", new Object[]{"z", "A", "B", "b", "c", "d", "e", "g", "h", "i", "f", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x"});
            case NEW_MUTABLE_INSTANCE:
                return new apbs();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = y;
                if (aopfVar == null) {
                    synchronized (apbs.class) {
                        aopfVar = y;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            y = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
