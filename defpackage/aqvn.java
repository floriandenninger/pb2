package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqvn extends aonm implements aooz {
    public static final aqvn a;
    private static volatile aopf h;
    public int b;
    public aqdb c;
    public aqgn d;
    public aqcb e;
    public aqbj f;
    public aqcj g;
    private aqcq i;
    private avzv j;
    private athb k;
    private apsa l;
    private aubz m;
    private auuf n;
    private arhz o;
    private byte p = 2;

    static {
        aqvn aqvnVar = new aqvn();
        a = aqvnVar;
        aonm.registerDefaultInstance(aqvn.class, aqvnVar);
    }

    private aqvn() {
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
                return newMessageInfo(a, "\u0001\f\u0000\u0001\ue1d6\u181eﶜ㌆\f\u0000\u0000\f\ue1d6\u181eᐉ\u0006\uf243\u181fᐉ\b\uf143ᠤᐉ\u0000ﳴᠰᐉ\t\ue567ᠲᐉ\u0004\uef41ᠸᐉ\u0003\ue9c4ᯣᐉ\u0007\uea1cᯣᐉ\u0002\uec81⟕ᐉ\u000b\uf5b1⼞ᐉ\u0001\uf76d㋴ᐉ\u0005ﶜ㌆ᐉ\n", new Object[]{"b", "j", "l", "c", "m", "g", "f", "k", "e", "o", "d", "i", "n"});
            case NEW_MUTABLE_INSTANCE:
                return new aqvn();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (aqvn.class) {
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
