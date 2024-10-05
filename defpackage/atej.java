package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atej extends aonm implements aooz {
    private static volatile aopf B;
    public static final atej a;
    public apcv A;
    private avvp C;
    private byte D = 2;
    public int b;
    public int c;
    public aula d;
    public avso e;
    public aseb f;
    public atbp g;
    public asiu h;
    public atvr i;
    public aqjf j;
    public aquo k;
    public audu l;
    public apet m;
    public aquu n;
    public aqzo o;
    public apdm p;
    public apck q;
    public apgj r;
    public atse s;
    public aqht t;
    public apdb u;
    public aper v;
    public apcq w;
    public avdy x;
    public apes y;
    public aqjd z;

    static {
        atej atejVar = new atej();
        a = atejVar;
        aonm.registerDefaultInstance(atej.class, atejVar);
    }

    private atej() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.D);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.D = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0019\u0000\u0002ﭹ᥏\ue98f㷖\u0019\u0000\u0000\u0002ﭹ᥏ဉ\u0000\ue63bᮊဉ\u0011︿Ḗᐉ\u0001；‵ဉ\u0004遼⃝ဉ\u000b\uf601⃩ဉ\f\ufb0d⌰ဉ\u0003ｦ⍲ဉ\u0012\uf20e┶ဉ\u0017\uec7b⮮ဉ\u001dﵘ⮰ဉ\u001b\uf48fⱓဉ\u001e\uf007⸑ဉ\u001f\ue4ef⽴ဉ\u000f\ue987〙ဉ\u001c﵂ヶဉ#\ueea0ヷဉ\"\ue3a3ㅆဉ$ﵝ㏌ဉ'\ue70c㔱ᐉ\u0002\uf79c㕛ဉ\r\ue44a㖌ဉ\u000e\uef32㳠ဉ0\uf2f2㷔ဉ1\ue98f㷖ဉ3", new Object[]{"b", "c", "d", "m", "e", "g", "h", "i", "f", "n", "o", "r", "p", "s", "t", "l", "q", "v", "u", "w", "x", "C", "j", "k", "y", "z", "A"});
            case NEW_MUTABLE_INSTANCE:
                return new atej();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = B;
                if (aopfVar == null) {
                    synchronized (atej.class) {
                        aopfVar = B;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            B = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
